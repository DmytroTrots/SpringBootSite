package com.SpringSiteGOSH.Controllers;

import com.SpringSiteGOSH.DatabaseUsers.CustomUserDetails;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeworkAddPageController {

    @GetMapping
    @RequestMapping("/add/{subject}")
    public String homeworkAddPage(@RequestParam(value = "subject", required = false) String subject, Model model){
        CustomUserDetails userDetails = (CustomUserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        model.addAttribute("login", userDetails.getUsername());
        return "homeworkAddPage";
    }
}

