package com.dip.controller.dogshow;

import com.dip.entity.DogShow;
import com.dip.service.DogShowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by moneg on 28.12.2016.
 */
@Controller
public class DogShowController {

    @Autowired
    DogShowService dogShowService;


    @RequestMapping(value = {"/dogshows"}, method = {RequestMethod.GET})
    public ModelAndView DogShowPage() {
        List<DogShow> dogShows = dogShowService.getAll();
        System.out.println(dogShows);
        ModelAndView modelAndView = new ModelAndView("dogshow/dog_show");
        modelAndView.addObject("dogshows",dogShows);
        return modelAndView;
    }

//    @RequestMapping(value = {"/showDet"}, method = {RequestMethod.POST})
//    public ModelAndView DogShowDetailsPage(@RequestBody int id ) {
//        System.out.println("DogShow details");
//        List<DogShow> dogShows = dogShowService.getAll();
//        ModelAndView modelAndView = new ModelAndView("dogshow/dog_show_details");
//        modelAndView.addObject("showdet",dogShows.get(id));
//        return modelAndView;
//    }

    @RequestMapping(value = {"/showDet"}, method = {RequestMethod.POST})
    public ModelAndView DogShowDetailsPage(@PathVariable("dogshow_id") long dogshow_id ) {
        System.out.println("DogShow details");
        List<DogShow> dogShows = dogShowService.getAll();
        ModelAndView modelAndView = new ModelAndView("dogshow/dog_show_details");
        modelAndView.addObject("showdet",dogShows.get((int)dogshow_id));
        return modelAndView;
    }

}
