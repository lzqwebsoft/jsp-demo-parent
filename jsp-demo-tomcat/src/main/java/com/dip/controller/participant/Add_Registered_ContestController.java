package com.dip.controller.participant;

import com.dip.entity.Contest;
import com.dip.service.ContestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by moneg on 07.01.2017.
 */
@Controller
public class Add_Registered_ContestController {

    @Autowired
    ContestService contestService;

    @ModelAttribute("contest_list")
    public List<Contest> dogShows(){
        List<Contest> contest_list = new ArrayList<Contest>();
        contest_list = contestService.getAll();
        return contest_list;
    }

}
