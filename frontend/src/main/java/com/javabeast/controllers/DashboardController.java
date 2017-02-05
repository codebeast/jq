package com.javabeast.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("dashboard")
public class DashboardController {

    private static final String PAGE_NAME = "dashboard";

    @GetMapping
    public String getDashboard() {
        return PAGE_NAME;
    }
}
