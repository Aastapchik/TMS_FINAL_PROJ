package PROFIPROJ.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
@Controller
public class SecurityController {
    @PostMapping("/login")
    private String login(){
        return "login";
    }
    @GetMapping("/login")
    private String loginGet(){
        return "login";
    }
}