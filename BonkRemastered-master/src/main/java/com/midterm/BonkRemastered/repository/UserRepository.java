package com.midterm.BonkRemastered.repository;


import com.midterm.BonkRemastered.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
    User findByEmailAddress(String emailAddress);
    //for finding specific email address
}