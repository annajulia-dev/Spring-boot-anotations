package com.AnnasWeb.demo.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WelcomeController {
    private final LoggedUserManagementService loggedUserManagementService;
    private final LoginCountService loginCountService;

    public WelcomeController(LoggedUserManagementService loggedUserManagementService,
                            LoginCountService loginCountService){
        this.loggedUserManagementService = loggedUserManagementService;
        this.loginCountService = loginCountService;
    }

    @GetMapping("/welcome")
    public String getWelcome(Model page,
                             @RequestParam(required = false) String logout){
        if(logout != null){
            loggedUserManagementService.setUsername(null);
        }

        if(loggedUserManagementService.getUsername() == null){
            return "redirect:/";
        }
        page.addAttribute("username", loggedUserManagementService.getUsername());
        page.addAttribute("loginCount", loginCountService.getCount());
        return "welcome.html";
    }
}
