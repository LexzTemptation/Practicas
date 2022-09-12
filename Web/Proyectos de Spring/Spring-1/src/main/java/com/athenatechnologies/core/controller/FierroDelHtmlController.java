package com.athenatechnologies.core.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class FierroDelHtmlController
{
    @GetMapping("/home")
    public String home()
    {
        return "index.html";
    }
}