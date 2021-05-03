package com.SpringSiteGOSH.Controllers;

import com.SpringSiteGOSH.DatabaseUsers.CustomUserDetails;
import com.SpringSiteGOSH.DatabaseUsers.CustomUserDetailsService;
import com.SpringSiteGOSH.SubjectsServices.F_fitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;


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

    @GetMapping
    @RequestMapping("/schedule")
    public String schedulePage(HttpServletRequest request, Model model) {
        model.addAttribute("groupandcourse", customUserDetailsService.listAllUsers());
        CustomUserDetails userDetails = (CustomUserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        int course = userDetails.course();
        int groupofstudent = userDetails.groupofstudent();
        model.addAttribute("subjects", f_fitService.getSubjectByGroupAndCourse(course, groupofstudent));
        return "SchedulePage";
    }
}
