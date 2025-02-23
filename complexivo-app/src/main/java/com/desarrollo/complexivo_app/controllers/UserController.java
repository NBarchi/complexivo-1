package com.desarrollo.complexivo_app.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.desarrollo.complexivo_app.models.User;



@Controller
public class UserController {

    @GetMapping("/register")
    public String getFormRegister(){
        return "register"; //template
    }

    @PostMapping("/register")
    public String registerUser(@ModelAttribute User user){
        System.out.println(user.getName());
        return "register";
    }
    
    


    
    
}
