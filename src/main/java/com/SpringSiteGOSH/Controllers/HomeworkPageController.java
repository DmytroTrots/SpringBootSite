package com.SpringSiteGOSH.Controllers;

import com.SpringSiteGOSH.DatabaseUsers.CustomUserDetails;
import com.SpringSiteGOSH.DatabaseUsers.CustomUserDetailsService;
import com.SpringSiteGOSH.HomeworkDatabase.homeworkSubjectsService;
import com.SpringSiteGOSH.SubjectsServices.F_fitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;


@Controller
public class HomeworkPageController {

    @Autowired
    private CustomUserDetailsService customUserDetailsService;

    @Autowired
    private homeworkSubjectsService homeworkSubjectsService;

    public void setHomeworkSubjectsService(homeworkSubjectsService homeworkSubjectsService) {
        this.homeworkSubjectsService = homeworkSubjectsService;
    }

    public void setCustomUserDetailsService(CustomUserDetailsService customUserDetailsService){
        this.customUserDetailsService = customUserDetailsService;
    }

    @GetMapping
    @RequestMapping("/homework")
    public String homeworkPage(HttpServletRequest request, Model model) {
        model.addAttribute("groupandcourse", customUserDetailsService.listAllUsers());
        CustomUserDetails userDetails = (CustomUserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        int course = userDetails.course();
        int groupofstudent = userDetails.groupofstudent();
        model.addAttribute("subjects", homeworkSubjectsService.getHomeworkSubjects(course, groupofstudent));
        return "homeworkPage";
    }
}
