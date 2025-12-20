package com.AnnasWeb.demo.login;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LogInController {
    
    @GetMapping("/")
    public String getLogin(){
        return "login.html";
    }

    @PostMapping("/")
    public String postLogin(@RequestParam String username,
                            @RequestParam String password,
                            Model page){
        boolean isLogged =

        return "login.html";
    }
}
