package com.dip.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by moneg on 29.12.2016.
 */
@Controller
public class ContactController {
    @RequestMapping("/contact")
    public String Contact() {
        return "contact";
    }
}
