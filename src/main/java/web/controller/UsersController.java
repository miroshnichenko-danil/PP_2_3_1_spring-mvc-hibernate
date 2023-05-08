package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import web.service.ServiceWeb;

@Controller
public class UsersController {

    @Autowired
    private ServiceWeb service;

    @GetMapping("/")
    public String showUsers(Model model) {
        model.addAttribute("users", service.getUsers());
        return "all_users";
    }
}
