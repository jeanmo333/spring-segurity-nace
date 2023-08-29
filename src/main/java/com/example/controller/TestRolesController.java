package com.example.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestRolesController {

    @GetMapping("/accessAllROLE")
    //@PreAuthorize("hasAnyRole('ADMIN','USER','INVITED')")
    @PreAuthorize("hasRole('ADMIN') and hasRole('USER') and hasRole('INVITED')")
    //@PreAuthorize("hasRole('ADMIN')")
    public String accessAdmin(){
        return "Hola, has accedito con rol de accessAllROLE";
    }

    @GetMapping("/accessUser")
    @PreAuthorize("hasRole('USER')")
    public String accessUser(){
        return "Hola, has accedito con rol de USER";
    }

    @GetMapping("/accessInvited")
    @PreAuthorize("hasRole('INVITED')")
    public String accessInvited(){
        return "Hola, has accedito con rol de INVITED";
    }
}
