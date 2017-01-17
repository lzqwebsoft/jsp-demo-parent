package com.dip.controller;

import com.dip.entity.DogShow;
import com.dip.service.DogShowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by moneg on 14.01.2017.
 */
@Controller
public class SearchController {

    @Autowired
    DogShowService dogShowService;

    @RequestMapping(value = {"/search_page"}, method = {RequestMethod.GET})
    public ModelAndView SearchPage() {
        ModelAndView modelAndView = new ModelAndView("search");
        return modelAndView;
    }

    @RequestMapping(value = {"/search_dogshow/{search_text}"}, method = {RequestMethod.GET})
    public ModelAndView SearchDogShowPage(@PathVariable("search_text") String search_text) {
        ModelAndView modelAndView = new ModelAndView("dogshow/search_result");
        System.out.println("search dogshow");
        System.out.println(search_text);
        List<DogShow> dogShows = dogShowService.findByTitle(search_text);
        System.out.println(dogShows);
        return modelAndView;
    }
}
