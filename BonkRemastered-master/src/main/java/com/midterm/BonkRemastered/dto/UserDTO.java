package com.midterm.BonkRemastered.dto;

import com.midterm.BonkRemastered.model.User;
import java.util.Collections;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class UserDTO {

    private Long Id;

    private String firstName;

    private String lastName;

    private String middleName;

    private String email;

    private String phoneNum;

    private String password;

    //role
    private String role;

    private Integer businessOwner = 0;
    /*private Boolean isAdmin = false;*/



    private Integer opt1;


    private Boolean opt2;

    public UserDTO() {}





    public UserDTO(User user) {
        this.Id = user.getId();
        this.firstName = user.getFirstName();
        this.lastName = user.getLastName();
        this.middleName = user.getMiddleName();
        this.email = user.getEmail();
        this.phoneNum = user.getPhoneNum();
        this.password = user.getPassword();

        //role
        this.role = user.getRole().getName();


        this.businessOwner = user.getBusinessOwner();
        /*this.isAdmin = user.getAdmin();*/
    }





    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getBusinessOwner() {
        return businessOwner;
    }

    public void setBusinessOwner(Integer businessOwner) {
        this.businessOwner = businessOwner;
    }

/*    public Boolean getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(Boolean isAdmin) {
        this.isAdmin = isAdmin;
    }*/

    public Integer getOpt1() {
        return opt1;
    }

    public void setOpt1(Integer opt1) {
        this.opt1 = opt1;
    }

    public Boolean getOpt2() {
        return opt2;
    }

    public void setOpt2(Boolean opt2) {
        this.opt2 = opt2;
    }

    //Roles
    public String getRole(){return role;}
    public void setRole(String role) {
        this.role = role;
    }


}

