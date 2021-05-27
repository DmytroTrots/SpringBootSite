package com.SpringSiteGOSH.Controllers;

import com.SpringSiteGOSH.Repositories.CustomUserDetails;
import com.SpringSiteGOSH.Entities.HomeworkTasksEntity;
import com.SpringSiteGOSH.Repositories.HomeworkTasksRepository;
import com.SpringSiteGOSH.Services.HomeworkTasksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class HomeworkTasksPageController {
    @Autowired
    private HomeworkTasksRepository HomeworkTasksRepository;

    @Autowired
    private HomeworkTasksService HomeworkTasksService;

    @GetMapping("/homework/add")
    public String homeworkAddPage(@RequestParam("subject") String subject, Model model){
        CustomUserDetails userDetails = (CustomUserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        Date dateNow = new Date();
        SimpleDateFormat date = new SimpleDateFormat("yyyy.MM.dd");
        String login = userDetails.getUsername();
        model.addAttribute("homeworkTasks", HomeworkTasksService.getHomeworkTasks(login, date.format(dateNow), subject));
        model.addAttribute("subj", subject);
        model.addAttribute("login", userDetails.getUsername());
        return "HomeworkTasksPage";
    }

    @PostMapping("/homework/add")
    public String homeworkPostAddPage(@RequestParam("subject") String subject, @RequestParam String task, @RequestParam String deadline, Model model){
        CustomUserDetails userDetails = (CustomUserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        String login = userDetails.getUsername();
        model.addAttribute("login", userDetails.getUsername());
        HomeworkTasksEntity homeworkAdd = new HomeworkTasksEntity(subject, task, deadline, login);
        HomeworkTasksRepository.save(homeworkAdd);
        return "redirect:/homework";
    }
}

