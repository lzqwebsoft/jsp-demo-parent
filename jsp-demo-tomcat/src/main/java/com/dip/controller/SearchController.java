package com.dip.controller;

import com.dip.entity.DogShow;
import com.dip.service.DogShowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by moneg on 14.01.2017.
 */
@Controller
public class SearchController {

    @Autowired
    DogShowService dogShowService;


    @RequestMapping(value = {"/search_dogshow"}, method = {RequestMethod.POST})
    public ModelAndView SearchDogShowPage(@RequestParam("search_type") int search_type,@RequestParam("search_text") String search_text) {
        ModelAndView modelAndView = new ModelAndView("dogshow/search_result");
        System.out.println("search dogshow");
        System.out.println(search_text);
        System.out.println(search_type);
        if(search_type == 1){
            System.out.println("search by title" + search_type);
            List<DogShow> dogShows = dogShowService.findByTitle(search_text.trim());
            System.out.println(dogShows);
            modelAndView.addObject("dogshows_list",dogShows);
            return modelAndView;
        }
        if(search_type == 2){
            System.out.println("search by sponsor" + search_type);
            List<DogShow> dogShows = dogShowService.findBySponsor(search_text.trim());
            System.out.println(dogShows);
            modelAndView.addObject("dogshows_list",dogShows);
            return modelAndView;
        }
        if(search_type == 3){
            System.out.println("search by organizer" + search_type);
            List<DogShow> dogShows = dogShowService.findByOrganizer(search_text.trim());
            System.out.println(dogShows);
            modelAndView.addObject("dogshows_list",dogShows);
            return modelAndView;
        }
        if(search_type == 4){
            System.out.println("search by forwhom" + search_type);
            List<DogShow> dogShows = dogShowService.findByForwhom(search_text);
            System.out.println(dogShows);
            modelAndView.addObject("dogshows_list",dogShows);
            return modelAndView;
        }
        modelAndView.setViewName("error");
        return modelAndView;
    }

//    @RequestMapping(value = {"/search_dog"}, method = {RequestMethod.POST})
//    public ModelAndView SearchDogPage(@RequestParam("search_type") int search_type,@RequestParam("search_text") String search_text) {
//        ModelAndView modelAndView = new ModelAndView("dogshow/search_result");
//        System.out.println("search dogshow");
//        System.out.println(search_text);
//        if(search_type == 1){
//            List<DogShow> dogShows = dogShowService.findByTitle(search_text.trim());
//            System.out.println(dogShows);
//            modelAndView.addObject("dogshows_list",dogShows);
//            return modelAndView;
//        }
//        if(search_type == 2){
//            List<DogShow> dogShows = dogShowService.findBySponsor(search_text.trim());
//            System.out.println(dogShows);
//            modelAndView.addObject("dogshows_list",dogShows);
//            return modelAndView;
//        }
//        if(search_type == 3){
//            List<DogShow> dogShows = dogShowService.findByOrganizer(search_text.trim());
//            System.out.println(dogShows);
//            modelAndView.addObject("dogshows_list",dogShows);
//            return modelAndView;
//        }
//        if(search_type == 4){
//            List<DogShow> dogShows = dogShowService.findByForwhom(search_text.trim());
//            System.out.println(dogShows);
//            modelAndView.addObject("dogshows_list",dogShows);
//            return modelAndView;
//        }
//        modelAndView.setViewName("error");
//        return modelAndView;
//    }
}
