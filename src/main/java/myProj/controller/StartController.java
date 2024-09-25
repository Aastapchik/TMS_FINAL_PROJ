package myProj.controller;

import myProj.localMemory.Const;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//@RequestMapping(path = "/profi")
public class StartController {

    @GetMapping(path = "/profi-welcome")
    private String welcome(Model model){

        model.addAttribute("cities", Const.CITIES);
        return "startPagePROFI";
    }

    @GetMapping(path = "/profi-registration")
    private String registration(Model model){
        model.addAttribute("cities", Const.CITIES);
        return "registrationForm";
    }

    @GetMapping(path = "/profi-logout")
    private String logout(Model model){
        model.addAttribute("cities", Const.CITIES);
        return "startPagePROFI";
    }
    @GetMapping(path = "/profi-welcome-user")
        private String pageAfterAuth(){
        return "startPagePROFI";
    }

}
