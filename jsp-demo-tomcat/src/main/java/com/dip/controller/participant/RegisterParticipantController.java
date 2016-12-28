package com.dip.controller.participant;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by moneg on 28.12.2016.
 */
@Controller
public class RegisterParticipantController {
    @RequestMapping(value = {"/register_participant"}, method = {RequestMethod.GET})
    public String RegisterParticipantPage() {
        return "register_participant";
    }
}
