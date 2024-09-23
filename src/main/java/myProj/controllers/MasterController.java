package myProj.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(name = "/profi/master")
public class MasterController {

    @GetMapping(name = "/login")
    private String loginMaster(){

        //todo ЛОГИКА ДЛЯ ВХОДА МАСТЕРА
        return "loginForm";
    }



}
