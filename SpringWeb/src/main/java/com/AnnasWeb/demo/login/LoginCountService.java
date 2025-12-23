package com.AnnasWeb.demo.login;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.ApplicationScope;

@Service
@ApplicationScope // similar to singleton but for web applications
public class LoginCountService {

    private int count;

    public void increment(){
        count++;
    }
    public int getCount(){
        return count;
    }
}
