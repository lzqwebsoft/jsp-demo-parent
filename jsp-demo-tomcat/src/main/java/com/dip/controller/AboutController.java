package com.dip.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by moneg on 28.12.2016.
 */
@Controller
public class AboutController {
    @RequestMapping("/about")
    public String About() {
        return "about";
    }
}
