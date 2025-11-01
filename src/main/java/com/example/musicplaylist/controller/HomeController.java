package com.example.musicplaylist.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        // redirect to your existing song list page
        return "redirect:/songs-list";
    }
}
