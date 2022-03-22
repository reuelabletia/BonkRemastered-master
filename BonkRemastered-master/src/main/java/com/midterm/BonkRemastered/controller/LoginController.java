package com.midterm.BonkRemastered.controller;


import com.midterm.BonkRemastered.dto.UserDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("login")
public class LoginController {

    @GetMapping
    private String index(Model model) {
        model.addAttribute("user", new UserDTO());
        return "login/index";
    }
}
