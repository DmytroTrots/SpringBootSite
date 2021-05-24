package com.SpringSiteGOSH.Controllers;

import com.SpringSiteGOSH.DatabaseUsers.CustomUserDetails;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ProfilePageController {

    @GetMapping
    @RequestMapping("/profile")
    public String schedulePage(Model model) {
        CustomUserDetails userDetails = (CustomUserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        model.addAttribute("login", userDetails.getUsername());
        model.addAttribute("course", userDetails.course());
        return "ProfilePage";
    }
}
