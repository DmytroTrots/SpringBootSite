package com.SpringSiteGOSH.Controllers;

import com.SpringSiteGOSH.DatabaseUsers.CustomUserDetailsService;
import com.SpringSiteGOSH.SubjectsServices.F_fitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class ShedulePageController {

    @Autowired
    private CustomUserDetailsService customUserDetailsService;

    @Autowired
    private F_fitService f_fitService;

    public void setCustomUserDetailsService(CustomUserDetailsService customUserDetailsService){
        this.customUserDetailsService = customUserDetailsService;
    }

    public void setF_fit_c2g9Service(F_fitService f_fitService){
        this.f_fitService = f_fitService;
    }

    @RequestMapping("/schedule")
    public String schedulePage(@RequestParam("course") int course, Model model) {
        model.addAttribute("groupandcourse", customUserDetailsService.listAllUsers());
        model.addAttribute("subjects", f_fitService.getSubjectByGroupAndCourse(course));
        return "SchedulePage";
    }
}
