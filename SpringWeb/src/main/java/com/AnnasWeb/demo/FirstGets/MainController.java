package com.AnnasWeb.demo.FirstGets;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @RequestMapping("/")
    public String index(){
        return "index";
    }

    @RequestMapping("/home")  //request parameters
    public String home(@RequestParam String color,
            Model page){
        page.addAttribute("name", "Katty");
        page.addAttribute("color", color);
        return "home.html";
    }
    @RequestMapping("/hello/{color}") //path variables
    public String hello(@PathVariable String color,
                        Model page){
        page.addAttribute("color", color);
        return "hello.html";
    }
}
