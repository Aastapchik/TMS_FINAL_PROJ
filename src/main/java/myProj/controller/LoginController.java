package myProj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

    @PostMapping("/login")
    public String login() {
        return "startPagePROFI";
    }
}