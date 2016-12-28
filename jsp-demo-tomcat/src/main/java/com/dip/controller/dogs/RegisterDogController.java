package com.dip.controller.dogs;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by moneg on 28.12.2016.
 */
@Controller
public class RegisterDogController {
    @RequestMapping(value = {"/register_dog"}, method = {RequestMethod.GET})
    public String RegisterDogPage() {
        return "register_dog";
    }
}
