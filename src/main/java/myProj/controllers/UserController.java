package myProj.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.sql.Statement;

@Controller
@RequestMapping(name = "/profi/user")
public class UserController {


    @GetMapping(name = "/login")
    private String login()
    {
        //todo ЛОГИКА ЛОГИРОВАНИЯ ЮЗЕРА
        return "loginForm";
    }

}
