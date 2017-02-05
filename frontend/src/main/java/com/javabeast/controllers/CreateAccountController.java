package com.javabeast.controllers;

import com.javabeast.domain.CreateAccountDto;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
@RequestMapping("signup")
public class CreateAccountController {

    private static String PAGE_NAME = "signup";


    @GetMapping
    public String getPage(CreateAccountDto createAccountDto) {
        return PAGE_NAME;
    }

    @PostMapping()
    public String submit(@Valid CreateAccountDto createAccountDto, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return PAGE_NAME;
        }
        return "redirect:/accesscode";
    }
}
