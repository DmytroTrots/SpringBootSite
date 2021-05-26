package com.SpringSiteGOSH.Controllers;

import com.SpringSiteGOSH.DatabaseUsers.CustomUserDetails;
import com.SpringSiteGOSH.HomeworkDatabase.homeworkAddDatabase;
import com.SpringSiteGOSH.HomeworkDatabase.homeworkAddDatabaseRepository;
import com.SpringSiteGOSH.HomeworkDatabase.homeworkAddService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class HomeworkAddPageController {
    @Autowired
    private homeworkAddDatabaseRepository homeworkAddDatabaseRepository;

    @Autowired
    private homeworkAddService homeworkAddService;

    @GetMapping("/homework/add")
    public String homeworkAddPage(@RequestParam("subject") String subject, Model model){
        CustomUserDetails userDetails = (CustomUserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        Date dateNow = new Date();
        SimpleDateFormat date = new SimpleDateFormat("yyyy.MM.dd");
        String login = userDetails.getUsername();
        model.addAttribute("homeworkTasks", homeworkAddService.getHomeworkTasks(login, date.format(dateNow), subject));
        model.addAttribute("subj", subject);
        model.addAttribute("login", userDetails.getUsername());
        return "homeworkAddPage";
    }

    @PostMapping("/homework/add")
    public String homeworkPostAddPage(@RequestParam("subject") String subject, @RequestParam String task, @RequestParam String deadline, Model model){
        CustomUserDetails userDetails = (CustomUserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        String login = userDetails.getUsername();
        model.addAttribute("login", userDetails.getUsername());
        homeworkAddDatabase homeworkAdd = new homeworkAddDatabase(subject, task, deadline, login);
        homeworkAddDatabaseRepository.save(homeworkAdd);
        return "redirect:homeworkPage";
    }
}

