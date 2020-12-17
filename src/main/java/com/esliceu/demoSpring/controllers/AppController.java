package com.esliceu.demoSpring.controllers;

import com.esliceu.demoSpring.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

@Controller
public class AppController {

    @Autowired
    User user;

    // REQUESTS
    @RequestMapping("/")
    public String index() { return "index"; }

    @RequestMapping("/login")
    public String login() {
        return "login";
    }

    @RequestMapping("/register")
    public String register(){ return "register"; }

    @RequestMapping("/notes")
    public String notes() { return "notes"; }

    @RequestMapping("/nota/${noteId}")
    public String note() {return "viewNote";}

    // POSTS
    @PostMapping("/notes")
    public String addNotes() { return "notes"; }

    // DELETE
    @DeleteMapping("/notes/${noteId}")
    public String deleteNotes() { return "notes"; }
}
