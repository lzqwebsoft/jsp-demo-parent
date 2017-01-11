package com.dip.controller.dogshow;

import com.dip.entity.*;
import com.dip.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import javax.persistence.Convert;
import javax.persistence.EntityManager;
import javax.websocket.server.PathParam;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by moneg on 28.12.2016.
 */
@Controller
public class DogShowController {

    @Autowired
    DogShowService dogShowService;
    @Autowired
    Registered_dogService registered_dogService;
    @Autowired
    ExpertService expertService;
    @Autowired
    JudgingService judgingService;
    @Autowired
    DogService dogService;


    @RequestMapping(value = {"/dogshows"}, method = {RequestMethod.GET})
    public ModelAndView DogShowPage() {
        ModelAndView modelAndView = new ModelAndView("dogshow/dog_show");
        List<DogShow> dogshows_list = dogShowService.getAll();
        System.out.println(dogshows_list);
        modelAndView.addObject("dogshows_list",dogshows_list);
        return modelAndView;
    }

    @RequestMapping(value = {"/showDet/{dogshow_id}"}, method = {RequestMethod.GET})
    public ModelAndView DogShowDetailsPage(@PathVariable ("dogshow_id") int dogshow_id ) {
        System.out.println("DogShow details");
        System.out.println(dogshow_id);
        DogShow dogShow = dogShowService.getById(dogshow_id);
        ModelAndView modelAndView = new ModelAndView("dogshow/dog_show_details");
        modelAndView.addObject("showdet",dogShow);
        System.out.println("EXPERTSS");
        modelAndView.addObject("experts_list", expertService.findByDogShow(dogShowService.getById(dogshow_id)));
        return modelAndView;
    }

//    @RequestMapping(value = {"/search/${search_type}"}, method = {RequestMethod.GET})
//    public ModelAndView SearchPage(@PathVariable ("search_type") int search_type) {
//        System.out.println("DogShow search");
//        System.out.println(search_type);
//
//        ModelAndView modelAndView = new ModelAndView("dogshow/dog_show_details");
//        return modelAndView;
//    }

    @RequestMapping(value = {"/dogs_list/{dogshow_id}"},method = {RequestMethod.GET})
    public ModelAndView DogsListPage(@PathVariable("dogshow_id") int dogshow_id){
        System.out.println("DOGSHOW_LIST");
        ModelAndView modelAndView = new ModelAndView("dogs/dogs_on_show");
        modelAndView.addObject("dogs_registered_list",dogService.findByDogShow(dogShowService.getById(dogshow_id)));
        return modelAndView;
    }

    @RequestMapping(value = {"/delete_show"}, method = {RequestMethod.POST})
    public RedirectView deleteDogShow(@RequestParam ("dogshow_id") int dogshow_id ) {
        System.out.println("delete dog show");
        System.out.println(dogshow_id);
        dogShowService.delete(dogshow_id);
        RedirectView redirectView = new RedirectView();
        redirectView.setContextRelative(true);
        redirectView.setUrl("/dogshows");
        return redirectView;
    }

}
