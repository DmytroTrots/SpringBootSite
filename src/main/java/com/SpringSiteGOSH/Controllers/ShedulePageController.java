package com.SpringSiteGOSH.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ShedulePageController {

    @GetMapping("/schedule")
    public String schedulePage(Model model) {
        model.addAttribute("ShedulePage", "DELETED");
        return "SchedulePage";
    }
}
