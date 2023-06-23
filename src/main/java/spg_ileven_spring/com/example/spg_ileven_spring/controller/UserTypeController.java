package spg_ileven_spring.com.example.spg_ileven_spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import spg_ileven_spring.com.example.spg_ileven_spring.entity.User;
import spg_ileven_spring.com.example.spg_ileven_spring.entity.UserType;
import spg_ileven_spring.com.example.spg_ileven_spring.repository.UserTypeRepository;

import java.util.List;

@RestController
@RequestMapping("/usersType")
public class UserTypeController {

    @Autowired
    private UserTypeRepository userTypeRepository;


    @PostMapping
    public UserType createUserType(@RequestBody UserType userType) {
        return userTypeRepository.save(userType);
    }
    @GetMapping
    public List<UserType> getAllUsers() {
        return  userTypeRepository.findAll();
    }



}
