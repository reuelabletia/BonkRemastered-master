package com.midterm.BonkRemastered.controller;

import com.midterm.BonkRemastered.dto.BusinessDTO;
import com.midterm.BonkRemastered.dto.UserDTO;

import com.midterm.BonkRemastered.services.BusinessService;
import com.midterm.BonkRemastered.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("admin")
public class AdminController {


    @Autowired
    private UserService userService;


    @Autowired
    private BusinessService businessService;

    @GetMapping
    private String list(Model model) {
        model.addAttribute("users", userService.list());
        return "admin/index";
    }

    @GetMapping("/{id}")
    private String getUser(@PathVariable Long id, Model model) {

        model.addAttribute("user", userService.get(id));
        model.addAttribute("business", new BusinessDTO());


        return "admin/review";
    }



    @PutMapping
    private String updateAdmin(UserDTO user, Model model) {

        UserDTO previousUser = userService.get(user.getId()) ;
        user.setFirstName(previousUser.getFirstName());
        user.setMiddleName(previousUser.getMiddleName());
        user.setLastName(previousUser.getLastName());
        user.setEmail(previousUser.getEmail());
        user.setPassword(previousUser.getPassword());
        user.setPhoneNum(previousUser.getPhoneNum());
        userService.update(user);

        return list(model);
    }

    @DeleteMapping
    private String deleteUser(UserDTO user, Model model) {
        userService.delete(user.getId());
        return list(model);

    }



}
