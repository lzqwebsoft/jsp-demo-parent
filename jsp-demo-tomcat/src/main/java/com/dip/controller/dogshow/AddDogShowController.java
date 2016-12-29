package com.dip.controller.dogshow;

import com.dip.entity.Contest;
import com.dip.entity.Contest_type;
import com.dip.entity.DogShow;
import com.dip.service.ContestService;
import com.dip.service.ContestTypeService;
import com.dip.service.DogShowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


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


    @RequestMapping(value = {"/add_dog_show"}, method = {RequestMethod.GET})
    public ModelAndView AddDogShowPage() {
        ModelAndView modelAndView = new ModelAndView("dogshow/add_dog_show");
        System.out.println("BEFORE GETTING ALL CONTESTS");
        List<Contest> contests = contestService.getAll();
        System.out.println(contests);
        modelAndView.addObject("show_contest",contests);
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
                             @RequestParam("contest_description") String contest_description, @RequestParam("contest_type") Integer forwhom){
        ModelAndView mv = new ModelAndView();
           Contest_type contest_type = new Contest_type();
           contest_type.setForWhom(forwhom);
        Contest contest = new Contest();
//        contest.setContest_type_id((int) contest_type.getContest_type_id());
        contest.setContest_type(contest_type);
        contest.setTitle(contest_title);
        contest.setDescription(contest_description);
        contestService.addContest(contest);
        DogShow dogshow = new DogShow();
        dogshow.setContest_id((int) contest.getContest_id());
        dogshow.setTitle(title);
        dogshow.setDate(date);
        dogshow.setSponsor(sponsor);
        dogshow.setDescription(description);
        dogshow.setAddress(address);
        dogshow.setOrganizer(organizer);
        dogShowService.addDogShow(dogshow);
        mv.setViewName("dogshow/finished");
        return mv;
        }
}
