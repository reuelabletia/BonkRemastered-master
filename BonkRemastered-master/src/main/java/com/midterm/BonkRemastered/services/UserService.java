package com.midterm.BonkRemastered.services;


import com.midterm.BonkRemastered.dto.UserDTO;

import java.util.List;

public interface UserService {

    List<UserDTO> list();

    void add(UserDTO user);

    UserDTO get(Long id);

    void update(UserDTO updatedUser);

    void delete(Long id);

    //retrieve an email address and password
    UserDTO validateUser(String emailAddress, String password);

}