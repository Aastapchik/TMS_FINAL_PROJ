package myProj.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class StartController {

    @GetMapping("/welcome")
    private String welcome(){
        return "startPagePROFI";
    }

    @GetMapping(name = "/registration")
    private String registration(){
        //todo ЛОГИКА РЕГИСТРАЦИИ И СОХРАНЕНИЯ В БД
        return "registrationForm";
    }

    @GetMapping(name = "/logout")
    private String logout(){
        //todo ЛОГИКА ЛОГАУТА
        return "startPagePROFI";
    }

}
