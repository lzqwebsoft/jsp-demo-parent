package com.dip.controller.admin;

import com.dip.entity.Human;
import com.dip.entity.Participant;
import com.dip.entity.Registered_Contest_Participant;
import com.dip.service.ParticipantService;
import com.dip.service.Registered_ContestParticipantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;

/**
 * Created by Макс on 28.03.2017.
 */
@Controller
public class ParticipantController {

    @Autowired
    ParticipantService participantService;
    @Autowired
    Registered_ContestParticipantService registered_contestParticipantService;

    @RequestMapping(value = {"/admin/addParticipant"}, method = {RequestMethod.GET})
    public ModelAndView adminAddParticipantPage() {
        ModelAndView modelAndView = new ModelAndView("adminka/addParticipant");
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String name = authentication.getName();
        return modelAndView;
    }

    @RequestMapping(value = {"/admin/addParticipant"}, method = {RequestMethod.POST})
    public ModelAndView adminAddParticipant(@RequestParam("Fname") String fname, @RequestParam("Sname") String sname,
                                            @RequestParam("Lname") String lname, @RequestParam("Age") int age, @RequestParam("dogshow_id") int dogshow_id) {
        ModelAndView modelAndView = new ModelAndView("adminka/addParticipant");
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String name = authentication.getName();

        Participant participant = new Participant();
        Human human = new Human();
        human.setFname(fname);
        human.setSname(sname);
        human.setLname(lname);
        participant.setHuman(human);
        participant.setAge(age);
        participantService.addParticipant(participant);
        Registered_Contest_Participant registered_contestParticipant = new Registered_Contest_Participant();
        registered_contestParticipant.setParticipant(participant);
        registered_contestParticipant.setNumber(registered_contestParticipantService.RandomNumber());
        registered_contestParticipantService.addRegistered_Contest(registered_contestParticipant);
        return modelAndView;
    }
}
