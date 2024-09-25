package myProj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
//@RequestMapping(path = "/profi/user")
public class UserController {


    @GetMapping("/profi-user-myorders")
    private String viewingOrders() {

        return "myOrdersUser.jsp";
    }

}
