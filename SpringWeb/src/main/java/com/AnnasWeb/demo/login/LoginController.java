package com.AnnasWeb.demo.login;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
    private final LoginProcessor loginProcessor;

    @Autowired
    public LoginController(LoginProcessor loginProcessor){
        this.loginProcessor = loginProcessor;
    }
    
    @GetMapping("/")
    public String getLogin(){
        return "login.html";
    }

    @PostMapping("/")
    public String postLogin(@RequestParam String username,
                            @RequestParam String password,
                            Model page){
        loginProcessor.setUsername(username);
        loginProcessor.setPassword(password);
        boolean logged = loginProcessor.validateLogin();

        if(logged)
            return "redirect:/welcome";
        else
            page.addAttribute("message", "Login failed!");

        return "login.html";
    }
}
