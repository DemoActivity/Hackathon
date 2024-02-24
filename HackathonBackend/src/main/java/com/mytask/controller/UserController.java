package com.mytask.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mytask.entities.Users;
import com.mytask.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
    
    @Autowired
    private UserService userService;

    @GetMapping("/by-role")
    public List<Users> getUsersByRoleId(@RequestParam("roleId") Long roleId) {
    	System.out.println("In UserController"+roleId);
        return userService.getUsersByRoleId(roleId);
    }
}
