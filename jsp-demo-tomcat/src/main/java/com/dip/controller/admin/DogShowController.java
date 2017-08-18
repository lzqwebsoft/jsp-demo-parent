package com.dip.controller.admin;

import com.dip.entity.Contest;
import com.dip.entity.ContestType;
import com.dip.entity.DogShow;
import com.dip.service.ContestService;
import com.dip.service.DogShowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import javax.validation.Valid;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Max on 14.02.2017.
 */
@Controller
public class DogShowController {

    @Autowired
    ContestService contestService;
    @Autowired
    DogShowService dogShowService;

    @RequestMapping(value = {"/admin/addDogShow"}, method = {RequestMethod.GET})
    public ModelAndView adminAddDogShow() {
        ModelAndView modelAndView = new ModelAndView("adminka/addDogShow");
        Date date = new Date();
        date.setYear(date.getYear()+2);
        System.out.println(date);
        modelAndView.addObject("date",date);
        return modelAndView;
    }

    @ModelAttribute("contests")
    public List<String> contests(){
        try {
            List<Contest> contests = contestService.getAll().subList(0, 10);
            List<String> contest_names = new ArrayList<>();
            for (Contest contest : contests) {
                contest_names.add(contest.getTitle());
            }
            return contest_names;
        }catch (Exception ex){
            System.out.println("There is no contests");
            List<String> contest_names = new ArrayList<>();
            String noContests = "No Contests";
            contest_names.add(noContests);
            return contest_names;
        }
    }

    @RequestMapping(value = {"/admin/addDogShow"}, method = {RequestMethod.POST})
    public ModelAndView adminAddDogShow(@RequestParam("title") String title, @RequestParam("date") @DateTimeFormat(pattern="yyyy-MM-dd") Date date, @RequestParam("sponsor") String sponsor, @RequestParam("description") String description, @RequestParam("address") String address,
                                   @RequestParam("organizer") String organizer, @RequestParam("contest_title") String contest_title,
                                   @RequestParam("contest_description") String contest_description, @RequestParam("contest_type_id") int contest_type_id,
                                        ModelAndView modelAndView) {
        ContestType contest_type = new ContestType();
        contest_type.setContest_type_id(contest_type_id);
        Contest contest = new Contest();
        contest.setContest_type_id(contest_type.getContest_type_id());
        contest.setTitle(contest_title.trim());
        contest.setDescription(contest_description.trim());
        contestService.addContest(contest);
        DogShow dogshow = new DogShow();
        dogshow.setTitle(title.trim());
        dogshow.setDate(date);
        dogshow.setSponsor(sponsor.trim());
        dogshow.setDescription(description.trim());
        dogshow.setAddress(address.trim());
        dogshow.setOrganizer(organizer.trim());
        dogShowService.addDogShow(dogshow);


//        String fileName = null;
//        if (!file.isEmpty()) {
//            try {
//                fileName = dogshow.getDogshow_id()+".jpg";
//                byte[] bytes = file.getBytes();
//                BufferedOutputStream buffStream =
//                        new BufferedOutputStream(new FileOutputStream(new File("Posters"+fileName)));
//                buffStream.write(bytes);
//                buffStream.close();
//                System.out.println("You have successfully uploaded " + fileName);
//            } catch (Exception e) {
//                System.out.println("You failed to upload " + fileName + ": " + e.getMessage());
//            }
//        } else {
//            System.out.println("Unable to upload. File is empty.");
//        }

//        RedirectView redirectView = new RedirectView();
//        redirectView.setContextRelative(true);
//        redirectView.setUrl("/admin/finished");
        return modelAndView;
    }

    @RequestMapping(value = {"/admin/addTest"}, method = {RequestMethod.POST})
    public ModelAndView adminAddDogShowTest(@Valid @ModelAttribute DogShow dogShow, @Valid @ModelAttribute Contest contest, BindingResult bindingResult, ModelMap model) {
        ModelAndView modelAndView = new ModelAndView("adminka/dashboard");
        model.addAttribute("title", dogShow.getTitle().trim());
        model.addAttribute("description", dogShow.getDescription().trim());
        model.addAttribute("date", dogShow.getDate());
        model.addAttribute("sponsor", dogShow.getSponsor().trim());
        model.addAttribute("address", dogShow.getAddress().trim());
        model.addAttribute("organizer", dogShow.getOrganizer().trim());
        model.addAttribute("organizer", contest.isChecked());
        model.addAttribute("contests", dogShow.getContests());
//        DogShow dogShowNew = new DogShow();
//        dogShowNew.setAddress( model.addAttribute("address", dogShow.getAddress().trim()).toString());
        System.out.println( model.addAttribute("address", dogShow.getAddress().trim()).toString());
        return modelAndView;
    }


}
