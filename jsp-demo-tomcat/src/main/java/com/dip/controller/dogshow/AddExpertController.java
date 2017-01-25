package com.dip.controller.dogshow;

import com.dip.entity.DogShow;
import com.dip.entity.Expert;
import com.dip.entity.Human;
import com.dip.service.DogShowService;
import com.dip.service.ExpertService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import java.util.*;

/**
 * Created by moneg on 07.01.2017.
 */
@Controller
public class AddExpertController {
    @Autowired
    DogShowService dogShowService;
    @Autowired
    ExpertService expertService;

    @ModelAttribute("dogshow_list")
    public List<DogShow> dogShows(){
        List<DogShow> dogShows = new ArrayList<DogShow>();
        dogShows = dogShowService.getAll();
        return dogShows;
    }

    @RequestMapping(value = {"/register_expert"}, method = {RequestMethod.GET})
    public ModelAndView RegisterExpertPage() {
        ModelAndView modelAndView = new ModelAndView("dogshow/add_expert");
        return modelAndView;
    }

    @RequestMapping(value = {"/add_expert"}, method = {RequestMethod.POST})
    public ModelAndView RegisterExpertPost(@RequestParam("fname") String fname, @RequestParam("sname") String sname,
                                           @RequestParam("lname") String lname, @RequestParam("country") String country,
                                           @RequestParam("description") String description,@RequestParam("dogshow_id") int dogshow_id) {

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
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("dogshow/finished_expert");
        String expertt = "Expert";
        modelAndView.addObject("human",expertt);
        return modelAndView;
    }

    @RequestMapping(value = {"/delete_expert"}, method = {RequestMethod.POST})
    public RedirectView deleteExpert(@RequestParam ("showdet.dogshow_id") int dogshow_id) {
        System.out.println("delete dog show");
//        judgingService.deleteByJudging(judgingService.findByDogShow(dogShowService.getById(dogshow_id)));
        RedirectView redirectView = new RedirectView();
        redirectView.setContextRelative(true);
        redirectView.setUrl("/dogshows");
        return redirectView;
    }

    @RequestMapping(value = {"/add_expert_separate/{dogshow_id}"}, method = {RequestMethod.GET})
    public ModelAndView AddExpertSeparate(@PathVariable("dogshow_id") int dogshow_id){

        ModelAndView modelAndView = new ModelAndView("dogshow/add_expert_separate");
        DogShow dogShow = dogShowService.getById(dogshow_id);
        Date now = new Date();
        Date date = new Date(now.getYear(), now.getMonth()-3,now.getDay());
        modelAndView.addObject("date",date);
        modelAndView.addObject("dogshow",dogShow);
        return modelAndView;
    }
}
