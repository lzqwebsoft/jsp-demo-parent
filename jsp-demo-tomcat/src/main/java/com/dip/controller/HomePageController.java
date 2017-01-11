/*
 * Copyright 2016 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.dip.controller;

//import com.dip.entity.User;
////import com.dip.entity.UserValidator;
//import com.dip.service.SecurityService;
//import com.dip.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomePageController {

//	@Autowired
//	private UserService userService;
//
//	@Autowired
//	private SecurityService securityService;

//	@Autowired
//	private UserValidator userValidator;

	@RequestMapping(value = {"/","home_page"}, method = {RequestMethod.GET})
	public String HomePage() {
		return "home_page";
	}


	@RequestMapping(value = "/registration", method = RequestMethod.GET)
	public String registration(Model model) {
		return "registration";
	}
//
//	@RequestMapping(value = "/registration", method = RequestMethod.POST)
//	public String registration(@ModelAttribute("userForm") User userForm, BindingResult bindingResult, Model model) {
//		userValidator.validate(userForm, bindingResult);
//
//		if (bindingResult.hasErrors()) {
//			return "registration";
//		}
//
//		userService.save(userForm);
//
//		securityService.autologin(userForm.getUsername(), userForm.getPasswordConfirm());
//
//		return "redirect:/welcome";
//	}
//
//	@RequestMapping(value = "/login", method = RequestMethod.GET)
//	public String login(Model model, String error, String logout) {
//		if (error != null)
//			model.addAttribute("error", "Your username and password is invalid.");
//
//		if (logout != null)
//			model.addAttribute("message", "You have been logged out successfully.");
//
//		return "login";
//	}
}
