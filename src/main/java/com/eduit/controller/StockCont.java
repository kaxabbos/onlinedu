package com.eduit.controller;

import com.eduit.controller.main.Attributes;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/stock")
public class StockCont extends Attributes {
    @GetMapping
    public String Statics(Model model) {
        AddAttributes(model);
        return "stock";
    }
}
