package com.bug.hunter.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BotherController {

    @GetMapping("/bother")
    public String index(@RequestParam(name="name",required = false, defaultValue="690") String name, Model model) {
        model.addAttribute("name", name);
        return "bother";
    }
}
