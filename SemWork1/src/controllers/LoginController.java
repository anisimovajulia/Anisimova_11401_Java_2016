package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.security.Principal;

/**
 * Created by Julia_2 on 20.04.2016.
 */
@Controller

public class LoginController {
    @RequestMapping(value="/signin",method = RequestMethod.GET)
    public String indexPage() {

        return "signin";
    }
    @RequestMapping(value="/main",method = RequestMethod.GET)
    public String helloPage(ModelMap model, Principal principal){
        String name = principal.getName();
        model.addAttribute("username", name);
        return "hello";
    }
}
