package com.SpringSiteGOSH.Controllers;

import com.SpringSiteGOSH.DatabaseUsers.CustomUserDetails;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ProfilePageController {

    @GetMapping
    @RequestMapping("/profile/{login}")
    public String schedulePage(@RequestParam(value = "login", required = false) String login, Model model) {
        CustomUserDetails userDetails = (CustomUserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        model.addAttribute("login", userDetails.getUsername());
        model.addAttribute("course", userDetails.course());
        model.addAttribute("group", userDetails.groupofstudent());
        model.addAttribute("firstname", userDetails.firstname());
        model.addAttribute("email", userDetails.email());
        model.addAttribute("faculty", userDetails.faculty());
        model.addAttribute("surname", userDetails.surname());
        return "ProfilePage";
    }
}
