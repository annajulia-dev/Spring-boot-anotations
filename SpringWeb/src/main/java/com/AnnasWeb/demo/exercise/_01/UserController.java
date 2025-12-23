package com.AnnasWeb.demo.exercise._01;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller

public class UserController {

    @GetMapping("/user")
    public String getUser(@RequestParam(required = false, defaultValue = "Officer") String user,
                          @RequestParam(required = false, defaultValue = "Standard") String sector,
                        Model page){
        page.addAttribute("name", user);

        String color;
        if(sector.equalsIgnoreCase("EXTERIOR"))
            color = "red";
        else
            color = "blue";

        page.addAttribute("color", color);
        return "user.html";
    }
}
