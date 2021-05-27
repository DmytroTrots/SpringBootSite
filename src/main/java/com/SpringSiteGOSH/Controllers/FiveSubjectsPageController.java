package com.SpringSiteGOSH.Controllers;

import com.SpringSiteGOSH.Repositories.CustomUserDetails;
import com.SpringSiteGOSH.Services.CustomUserDetailsService;
import com.SpringSiteGOSH.Services.FiveSubjectsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class FiveSubjectsPageController {

    @Autowired
    private CustomUserDetailsService customUserDetailsService;

    @Autowired
    private FiveSubjectsService FiveSubjectsService;

    @GetMapping
    @RequestMapping("/homework")
    public String homeworkPage(Model model) {
        model.addAttribute("groupandcourse", customUserDetailsService.listAllUsers());
        CustomUserDetails userDetails = (CustomUserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        int course = userDetails.course();
        int groupofstudent = userDetails.groupofstudent();
        model.addAttribute("login", userDetails.getUsername());
        model.addAttribute("subjects", FiveSubjectsService.getHomeworkSubjects(course, groupofstudent));
        return "FiveSubjectsPage";
    }

}
