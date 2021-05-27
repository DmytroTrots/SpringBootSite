package com.SpringSiteGOSH.Controllers;

import com.SpringSiteGOSH.Repositories.CustomUserDetails;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LinksPageController {

    @GetMapping
    @RequestMapping("/links")
    public String linksPage(Model model) {
        CustomUserDetails userDetails = (CustomUserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        model.addAttribute("login", userDetails.getUsername());
        return "UsefulLinks";
    }
}
