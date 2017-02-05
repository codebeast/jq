package com.javabeast.controllers;

import com.javabeast.domain.CreateAccountDto;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@Controller
@RequestMapping("/accesscode")
public class CreateAccountEmailController {

    private static String PAGE_NAME = "accesscode";


    @GetMapping
    public String getPage() {
        return PAGE_NAME;
    }


    // return"redirect:/results";
}
