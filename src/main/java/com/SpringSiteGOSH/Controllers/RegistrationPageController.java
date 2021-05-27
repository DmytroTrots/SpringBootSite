package com.SpringSiteGOSH.Controllers;

import com.SpringSiteGOSH.Entities.UsersEntity;
import com.SpringSiteGOSH.Repositories.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegistrationPageController {
    private final UsersRepository repository;

    @Autowired
    public RegistrationPageController(UsersRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/registration")
    public String registrationPage(Model model){
        model.addAttribute("user", new UsersEntity());
        return "RegistrationPage";
    }

    @PostMapping("/process_register")
    public String proccesRegister(UsersEntity usersEntity){
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        String encodedPassword = encoder.encode(usersEntity.getPassword());
        usersEntity.setPassword(encodedPassword);
        repository.save(usersEntity);
        return "LoginPage";
    }
}
