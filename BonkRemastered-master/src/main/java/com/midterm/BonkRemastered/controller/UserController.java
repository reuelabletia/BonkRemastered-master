package com.midterm.BonkRemastered.controller;


import com.midterm.BonkRemastered.dto.BusinessDTO;
import com.midterm.BonkRemastered.dto.UserDTO;

import com.midterm.BonkRemastered.services.BusinessService;
import com.midterm.BonkRemastered.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;



@Controller
@RequestMapping("user")
public class UserController {

    private static final String CUSTOMER_ROLE = "ROLE_USER";

    @Autowired
    private UserService userService;

    @Autowired
    private BusinessService businessService;



    @GetMapping("/login")
    private String getUserAddForm(Model model) {
        model.addAttribute("user", new UserDTO());
        return "user/login";
    }

    @PostMapping
    private String addUser(UserDTO user, Model model) {
        user.setRole(CUSTOMER_ROLE);
        userService.add(user);
        return "user/index";
    }

    @GetMapping("/{id}")
    private String getUser(@PathVariable Long id, Model model) {

        model.addAttribute("user", userService.get(id));
        model.addAttribute("business", new BusinessDTO());
        return "user/businessform";
    }

    @PostMapping("/{userId}/business")
    private String adduserBusiness(@PathVariable Long userId, BusinessDTO businessDTO, Model model){
        businessDTO.setOwner(userId);
        businessService.add(businessDTO);

        return getUser(userId, model);
    }




}
