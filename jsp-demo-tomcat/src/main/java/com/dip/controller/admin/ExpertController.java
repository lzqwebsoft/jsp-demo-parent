package com.dip.controller.admin;

import com.dip.entity.DogShow;
import com.dip.entity.Expert;
import com.dip.entity.Human;
import com.dip.service.DogShowService;
import com.dip.service.ExpertService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Set;
import java.util.TreeSet;

/**
 * Created by Макс on 28.03.2017.
 */
@Controller
public class ExpertController {

    @Autowired
    ExpertService expertService;
    @Autowired
    DogShowService dogShowService;

    @RequestMapping(value = {"/admin/addExpertToDogShow"}, method = {RequestMethod.GET})
    public ModelAndView adminAddExpertPage() {
        ModelAndView modelAndView = new ModelAndView("adminka/addExpertToDogShow");
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String name = authentication.getName();
        return modelAndView;
    }

    @RequestMapping(value = {"/admin/addExpertToDogShow"}, method = {RequestMethod.POST})
    public ModelAndView adminAddExpert(@RequestParam("fname") String fname, @RequestParam("sname") String sname,
                                       @RequestParam("lname") String lname, @RequestParam("country") String country,
                                       @RequestParam("description") String description, @RequestParam("dogshow_id") int dogshow_id) {
        ModelAndView modelAndView = new ModelAndView("adminka/addExpertToDogShow");
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String name = authentication.getName();
        Expert expert = new Expert();
        Human human = new Human();
        human.setFname(fname);
        human.setSname(sname);
        human.setLname(lname);
        expert.setHuman(human);
        expert.setCountry(country.trim());
        expert.setDescription(description.trim());
        expertService.addExpert(expert);
        DogShow dogShow = dogShowService.getById(dogshow_id);
        Set<Expert> expertSet = new TreeSet<Expert>();
        expertSet.add(expert);
        dogShow.setExperts(expertSet);

        //ADD LINK TO PAGE WHERE USER COULD SEE ALL EXPERTS ON THE SHOW
        modelAndView.setViewName("adminka/addExpertToDogShow");
        return modelAndView;
    }

}
