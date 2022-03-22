package com.midterm.BonkRemastered.controller;


import com.midterm.BonkRemastered.dto.UserDTO;
import com.midterm.BonkRemastered.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("register")
public class RegistrationController {

    private static final String CUSTOMER_ROLE = "ROLE_CUSTOMER";

    @Autowired
    private UserService userService;

    @GetMapping
    private String index(Model model) {
        model.addAttribute("user", new UserDTO());
        return  "user/index";
    }


    @PostMapping
    private String register(UserDTO userDTO, Model model) {
        userDTO.setRole(CUSTOMER_ROLE);
        userService.add(userDTO);
        return"user/index";
    }
}
