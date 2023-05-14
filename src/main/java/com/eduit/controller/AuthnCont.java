package com.eduit.controller;

import com.eduit.controller.main.Attributes;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/login")
public class AuthnCont extends Attributes {

    @GetMapping
    public String login(Model model) {
        AddAttributes(model);
        return "login";
    }
}
