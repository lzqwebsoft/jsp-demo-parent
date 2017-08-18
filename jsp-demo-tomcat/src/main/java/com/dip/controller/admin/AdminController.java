package com.dip.controller.admin;

import com.dip.entity.Human;
import com.dip.entity.User;
import com.dip.service.HumanService;
import com.dip.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Max on 05.02.2017.
 */
@Controller
public class AdminController {

    @Autowired
    UserService userService;
    @Autowired
    private PasswordEncoder encoder;
    @Autowired
    HumanService humanService;

    @RequestMapping(value = {"/admin/home_page"}, method = {RequestMethod.GET})
    public ModelAndView adminHome() {
        System.out.println("ADMINKAA");
        ModelAndView modelAndView = new ModelAndView("adminka/dashboard");
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String name = authentication.getName();
        return modelAndView;
    }

    @RequestMapping(value = {"/admin/userDetails"}, method = {RequestMethod.GET})
    public ModelAndView UserDetails() {
        System.out.println("userDetails");
        ModelAndView modelAndView = new ModelAndView("adminka/userDetails");
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        User admin = userService.findByUsername(authentication.getName());
        modelAndView.addObject("user",admin);
        return modelAndView;
    }

    @RequestMapping(value = {"/admin/userDetailsChange"}, method = {RequestMethod.POST})
    public ModelAndView UserDetailsChange(@RequestParam("username") String username, @RequestParam("email") String email, @RequestParam("password") String password,
                                          @RequestParam("old_password") String old_password,@RequestParam("new_password") String new_password,
                                          @RequestParam("fname") String fname, @RequestParam("sname") String sname, @RequestParam("lname") String lname) {
        System.out.println("userDetailsChange");
        ModelAndView modelAndView = new ModelAndView("adminka/userDetails");
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        User admin_new = userService.findByUsername(authentication.getName());
        System.out.println("USER");
        System.out.println(admin_new.getUsername());
        System.out.println("USERNAME");
        System.out.println(username);
        admin_new.setUsername(username);
        admin_new.setEmail(email.trim());
        if(encoder.encode(old_password) == admin_new.getPassword()){
            if(new_password == password){
                admin_new.setPassword(encoder.encode(password.trim()));
            }
        }
        Human human_new = new Human();
        human_new.setFname(fname.trim());
        human_new.setLname(lname.trim());
        human_new.setSname(sname.trim());
        humanService.addHuman(human_new);
        admin_new.setHuman(human_new);
        userService.save(admin_new);
        return modelAndView;
    }

}
