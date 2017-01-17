package com.dip.controller.dogshow;

import com.dip.entity.DogShow;
import com.dip.entity.Expert;
import com.dip.entity.Judging;
import com.dip.service.DogShowService;
import com.dip.service.ExpertService;
import com.dip.service.JudgingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by moneg on 07.01.2017.
 */
@Controller
public class AddExpertController {
    @Autowired
    DogShowService dogShowService;
    @Autowired
    ExpertService expertService;
    @Autowired
    JudgingService judgingService;

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
        expert.setFname(fname.trim());
        expert.setSname(sname.trim());
        expert.setLname(lname.trim());
        expert.setCountry(country.trim());
        expert.setDescription(description.trim());
        expertService.addExpert(expert);
        DogShow dogShow = dogShowService.getById(dogshow_id);
        Judging judging = new Judging();
        judging.setDogShow(dogShow);
        judging.setExpert(expert);
        judgingService.addJudging(judging);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("dogshow/finished");
        String expertt = "Expert";
        modelAndView.addObject("human",expertt);
        return modelAndView;
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
