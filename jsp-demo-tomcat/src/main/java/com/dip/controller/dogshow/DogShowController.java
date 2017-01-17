package com.dip.controller.dogshow;

import com.dip.entity.*;
import com.dip.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

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
    @Autowired
    Registered_ContestParticipantService registered_contestParticipantService;
    @Autowired
    RegisteredContestDogService registeredContestDogService;
    @Autowired
    ParticipantService participantService;

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

    @RequestMapping(value = {"/dogs_on_contest/{dogshow_id}"},method = {RequestMethod.GET})
    public ModelAndView DogsOnContestListPage(@PathVariable("dogshow_id") int dogshow_id){
        ModelAndView modelAndView = new ModelAndView("dogs/dogs_on_contest");
//        List<Registered_Contest_Dog> registered_contest_dogs = registeredContestDogService.findByContest(dogShowService.getById(dogshow_id).getContest());
        List<Dog> dogs = dogService.findByContest(dogShowService.getById(dogshow_id).getContest());
        if(dogs.isEmpty()){
            ModelAndView modelAndView1 = new ModelAndView("dogshow/entity_not_found");
            String entity = "Dogs's";
            modelAndView1.addObject("entity",entity);
            return modelAndView1;
        }
        else{
            modelAndView.addObject("dogs_registered_list",dogs);
            return modelAndView;
        }

    }

    @RequestMapping(value = {"/participants_on_contest/{dogshow_id}"},method = {RequestMethod.GET})
    public ModelAndView ParticipantsOnContestListPage(@PathVariable("dogshow_id") int dogshow_id){
        ModelAndView modelAndView = new ModelAndView("participants/participants_on_contest");
        List<Participant> participants = participantService.findByContest(dogShowService.getById(dogshow_id).getContest());
        if(participants.isEmpty()) {
            ModelAndView modelAndView1 = new ModelAndView("dogshow/entity_not_found");
            String entity = "Participants's";
            modelAndView1.addObject("entity",entity);
            return modelAndView1;
        }
        else {
            modelAndView.addObject("participants_registered_list", participants);
            return modelAndView;
        }
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
