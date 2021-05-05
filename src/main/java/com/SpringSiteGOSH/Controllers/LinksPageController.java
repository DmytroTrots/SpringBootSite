package com.SpringSiteGOSH.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LinksPageController {

    @GetMapping("/links")
    public String linksPage() {
        return "UsefulLinks";
    }
}
