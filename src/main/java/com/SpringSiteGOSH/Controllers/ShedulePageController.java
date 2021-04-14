package com.SpringSiteGOSH.Controllers;

import com.SpringSiteGOSH.SubjectsServices.f_fit_c2g9Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class ShedulePageController {

    @Autowired
    private f_fit_c2g9Service f_fit_c2g9Service;

    public void setF_fit_c2g9Service(f_fit_c2g9Service f_fit_c2g9Service){
        this.f_fit_c2g9Service = f_fit_c2g9Service;
    }

    @RequestMapping("/schedule")
    public String schedulePage(Model model) {
        model.addAttribute("subjects", f_fit_c2g9Service.listAllSubjects());
        return "SchedulePage";
    }
}
