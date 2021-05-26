package com.SpringSiteGOSH.Controllers;

import com.SpringSiteGOSH.DatabaseUsers.CustomUserDetails;
import com.SpringSiteGOSH.DatabaseUsers.CustomUserDetailsService;
import com.SpringSiteGOSH.HomeworkDatabase.homeworkSubjects;
import com.SpringSiteGOSH.HomeworkDatabase.homeworkSubjectsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeworkPageController {

    @Autowired
    private CustomUserDetailsService customUserDetailsService;

    @Autowired
    private homeworkSubjectsService homeworkSubjectsService;

    private com.SpringSiteGOSH.HomeworkDatabase.homeworkSubjects homeworkSubjects;

    @GetMapping
    @RequestMapping("/homework/{login}")
    public String homeworkPage(@RequestParam(value = "login", required = false) String login, Model model) {
        model.addAttribute("groupandcourse", customUserDetailsService.listAllUsers());
        CustomUserDetails userDetails = (CustomUserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        int course = userDetails.course();
        int groupofstudent = userDetails.groupofstudent();
        model.addAttribute("login", userDetails.getUsername());
        model.addAttribute("subjects", homeworkSubjectsService.getHomeworkSubjects(course, groupofstudent));
        return "homeworkPage";
    }

}
