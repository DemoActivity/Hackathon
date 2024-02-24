package com.mytask.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mytask.entities.Users;
import com.mytask.repo.UserRepo;

import jakarta.transaction.Transactional;

@Service
public class UserService {
    
    // Inject any necessary repositories or other dependencies
    @Autowired
    private UserRepo userRepo;
    
    @Transactional
    public List<Users> getUsersByRoleId(Long roleId) {
    	System.out.println("In UserService="+roleId);
    	return userRepo.findByRoleRoleId(roleId);
    }
}