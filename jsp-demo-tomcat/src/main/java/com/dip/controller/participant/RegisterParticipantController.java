package com.dip.controller.participant;

import com.dip.entity.Contest;
import com.dip.entity.Contest_type;
import com.dip.entity.DogShow;
import com.dip.entity.Participant;
import com.dip.service.ContestService;
import com.dip.service.ContestTypeService;
import com.dip.service.DogShowService;
import com.dip.service.ParticipantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by moneg on 28.12.2016.
 */
@Controller
public class RegisterParticipantController {
    @Autowired
    DogShowService dogShowService;
    @Autowired
    ParticipantService participantService;
    @Autowired
    ContestTypeService contestTypeService;
    @Autowired
    ContestService contestService;

    @ModelAttribute("dogshow_list")
    public List<DogShow> dogShows(){
//        List<DogShow> dogShows = dogShowService.findByContest(1);
//        System.out.println("Dog shows with contest type for people");
//        System.out.println(dogShows.get(0).getTitle());
        return null;
    }

    @RequestMapping(value = {"/reg_participant"}, method = {RequestMethod.GET})
    public ModelAndView RegisterParticipantPage() {
        System.out.println("ZASHEL");
        ModelAndView modelAndView = new ModelAndView("participants/reg_participant");
        return modelAndView;
    }

    @RequestMapping(value = {"/add_participant"}, method = {RequestMethod.POST})
    public ModelAndView AddParticipant(@RequestParam("Fname") String fname, @RequestParam("Sname") String sname,
                                       @RequestParam("Lname") String lname, @RequestParam("Age") int age){
        ModelAndView mv = new ModelAndView("participants/reg_participant");
        Participant participant = new Participant();
        participant.setFname(fname);
        participant.setSname(sname);
        participant.setLname(lname);
        participant.setAge(age);
        participantService.addParticipant(participant);
        mv.setViewName("participant/finished");
        return mv;
    }
}
