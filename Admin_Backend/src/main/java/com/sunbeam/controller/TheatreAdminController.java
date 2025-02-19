package com.sunbeam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sunbeam.models.LoginRequest;
import com.sunbeam.service.TheatreAdminServiceImpl;

@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping("/theatre_admin")
public class TheatreAdminController {

    @Autowired
    private TheatreAdminServiceImpl adminService;

    @PostMapping("/login")
    public String login(@RequestBody LoginRequest request) {
    	System.out.println(request);
        if (adminService.authenticate(request.getEmail(), request.getPassword())) {
            return "Success";
        } else {
        	System.out.println("error by ritik");
            return "Error";
        }
    }
}