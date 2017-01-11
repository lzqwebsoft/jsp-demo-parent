package com.dip.controller.dogshow;

import com.dip.entity.*;
import com.dip.service.ContestService;
import com.dip.service.ContestTypeService;
import com.dip.service.DogShowService;
import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;


import javax.servlet.http.HttpServletRequest;
import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

/**
 * Created by moneg on 28.12.2016.
 */
@Controller
public class AddDogShowController {

    @Autowired
    DogShowService dogShowService;

    @Autowired
    ContestService contestService;

    @Autowired
    ContestTypeService contestTypeService;
    @Autowired
    FileUploadValidator fileValidator;

    public static final String uploadingdir = System.getProperty("user.dir") + "/dippp/";

    @ModelAttribute("contest_type_list")
    public List<Contest_type> contest_type(){
        List<Contest_type> contest_types = new ArrayList<Contest_type>();
        contest_types = contestTypeService.getAll();
        return contest_types;
    }


    @RequestMapping(value = {"/add_dog_show"}, method = {RequestMethod.GET})
    public ModelAndView AddDogShowPage() {
        ModelAndView modelAndView = new ModelAndView("dogshow/add_dog_show");
        return modelAndView;
    }

//    @RequestMapping(value = {"/show_contest"}, method = {RequestMethod.GET})
//    public ModelAndView ShowContest(ModelAndView modelAndView) {
//        List<Contest> contests = contestService.getAll();
//        modelAndView.addObject("show_contest",contests);
//        return modelAndView;
//    }

       @RequestMapping(value = {"/add_show"}, method = {RequestMethod.POST})
 public ModelAndView addShow(@RequestParam("title") String title, @RequestParam("date") @DateTimeFormat(pattern="yyyy-MM-dd") Date date, @RequestParam("sponsor") String sponsor, @RequestParam("description") String description, @RequestParam("address") String address,
                             @RequestParam("organizer") String organizer, @RequestParam("contest_title") String contest_title,
                             @RequestParam("contest_description") String contest_description, @RequestParam("contest_type_id") int contest_type_id,
                             @RequestParam("name") String name,
                             @RequestParam("image") MultipartFile image, BindingResult bindingResult){
           System.out.println("FORM ADD");
        ModelAndView mv = new ModelAndView();
        Contest_type contest_type = new Contest_type();
        contest_type.setContest_type_id(contest_type_id);
        Contest contest = new Contest();
        contest.setContest_type_id(contest_type.getContest_type_id());
        contest.setTitle(contest_title.trim());
        contest.setDescription(contest_description.trim());
        contestService.addContest(contest);
        DogShow dogshow = new DogShow();
        dogshow.setContest_id((int) contest.getContest_id());
        dogshow.setTitle(title.trim());
        dogshow.setDate(date);
        dogshow.setSponsor(sponsor.trim());
        dogshow.setDescription(description.trim());
        dogshow.setAddress(address.trim());
        dogshow.setOrganizer(organizer.trim());
        dogShowService.addDogShow(dogshow);




           if (bindingResult.hasErrors()) {
               System.out.println("error");
           }
           if (!image.isEmpty()) {
               try {
                   validateImage(image);
               } catch (RuntimeException re) {
                   bindingResult.addError(new ObjectError("image", "Only jpg images"));
                   System.out.println("only jpg images");;
               }
               try {
                   saveImage(dogshow.getDogshow_id() + "", image);
               } catch (IOException e) {
                   bindingResult.reject(e.getMessage());
                   System.out.println("ERROR");
               }
           }



           return new ModelAndView("dogshow/finished");
        }

    private void validateImage(MultipartFile image) {
        if (!image.getContentType().equals("image/jpeg")) {
            throw new RuntimeException("Only JPG images are accepted");
        }
    }

    private void saveImage(String filename, MultipartFile image)
            throws RuntimeException, IOException {
        try {
            File file = new File("src/main/resources/static/pics/"
                    + filename + ".jpg");
            FileUtils.writeByteArrayToFile(file, image.getBytes());
        } catch (IOException e) {
            throw e;
        }
    }






            // When click on submit, below method will get called
//    @RequestMapping("/submitFileUpload")
//    public ModelAndView fileUploaded(
//            @ModelAttribute("uploadedFile") FileUpload uploadedFile,
//            BindingResult result) {
//        InputStream inputStream = null;
//        OutputStream outputStream = null;
//        // Getting uploaded file
//        MultipartFile file = uploadedFile.getFile();
//        fileValidator.validate(uploadedFile, result);
//
//        String fileName = file.getOriginalFilename();
//
//        // If it has error, redirect it to same page
//        if (result.hasErrors()) {
//            return new ModelAndView("fileUploadForm");
//        }
//
//        try {
//            inputStream = file.getInputStream();
//
//            File newFile = new File("C:/Users/moneg/Desktop/spring-boot-jsp-demo-master/jsp-demo-tomcat/src/main/resources/static/pics/" + fileName);
//            if (!newFile.exists()) {
//                newFile.createNewFile();
//            }
//            outputStream = new FileOutputStream(newFile);
//            int read = 0;
//            byte[] bytes = new byte[1024];
//
//            while ((read = inputStream.read(bytes)) != -1) {
//                outputStream.write(bytes, 0, read);
//            }
//        } catch (IOException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }
//
//        return new ModelAndView("dogshow/finished");
//    }

}
