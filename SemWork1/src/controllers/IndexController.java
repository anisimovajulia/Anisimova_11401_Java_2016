package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Julia_2 on 14.04.2016.
 */
@Controller
@RequestMapping("")
public class IndexController {
    @RequestMapping(method = RequestMethod.GET)
    public String indexPage() {

        return "index";
    }
}
