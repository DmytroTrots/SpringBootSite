package com.SpringSiteGOSH.Controllers;

import com.SpringSiteGOSH.DatabaseUsers.User;
import com.SpringSiteGOSH.DatabaseUsers.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegistrationPageController {
    private final UserRepository repository;

    @Autowired
    public RegistrationPageController(UserRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/registration")
    public String registrationPage(Model model){
        model.addAttribute("user", new User());
        return "registrationPage";
    }

    @PostMapping("/process_register")
    public String proccesRegister(User user){
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        String encodedPassword = encoder.encode(user.getPassword());
        user.setPassword(encodedPassword);
        repository.save(user);
        return "referenceFromRegistration";
    }
}
