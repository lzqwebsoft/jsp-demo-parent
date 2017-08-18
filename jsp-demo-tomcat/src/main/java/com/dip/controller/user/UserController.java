package com.dip.controller.user;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Max on 09.02.2017.
 */
@Controller
public class UserController {
    @RequestMapping(value = {"/user/home_page"}, method = {RequestMethod.GET})
    public ModelAndView adminHome() {
        System.out.println("USER");
        ModelAndView modelAndView = new ModelAndView("user/home_page");
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String name = authentication.getName();
        return modelAndView;
    }
}
