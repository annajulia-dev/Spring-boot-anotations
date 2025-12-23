package com.AnnasWeb.demo.login;


import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

@Component
@RequestScope // create an instance every http request
public class LoginProcessor {
    private LoggedUserManagementService loggedUserManagementService;
    private LoginCountService loginCountService;

    public LoginProcessor(LoggedUserManagementService loggedUserManagementService,
                            LoginCountService loginCountService){
        this.loggedUserManagementService = loggedUserManagementService;
        this.loginCountService = loginCountService;
    }

    private String username;
    private String password;

    public boolean validateLogin(){
        loginCountService.increment();

        boolean isValidated = false;
            if(this.username.equals("Natalie") && this.password.equals("password")){
                loggedUserManagementService.setUsername(this.username);
                isValidated = true;
            }
        return isValidated;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

}
