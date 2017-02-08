package com.javabeast.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@Controller
@RequestMapping("/")
public class HomeController extends BaseController {

    @Override
    public String getViewName() {
        return "home";
    }

    @GetMapping
    public ModelAndView getPage(final HttpServletRequest httpServletRequest) {
        final Map<String, Object> model = getModel(httpServletRequest);
        return new ModelAndView(getViewName(), model);
    }

}
