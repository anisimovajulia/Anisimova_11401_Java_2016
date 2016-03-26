package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Julia_2 on 26.03.2016.
 */
@Controller
@RequestMapping("/add")
public class Add {
    @RequestMapping(method = RequestMethod.GET)
    public String addPage(ModelMap model, HttpServletRequest path) { //аналогично if request not null
        String response="";
        Pattern pattern = Pattern.compile("/(?<first>([1-9][0-9]*|0))/(?<second>([1-9][0-9]*|0))");
        Matcher matcher = pattern.matcher(path.getPathInfo());

        if (matcher.matches()){
            int k=Integer.parseInt(matcher.group("first"))+Integer.parseInt(matcher.group("second"));
            response=matcher.group("first") + "+" + matcher.group("second") + "=" + Integer.toString(k) + "\n" ;

        }else   response="Oooops...404";
        model.put("response", response);   //model аналогично root во freemarker

        return "add";             //название файла(hi.jsp)
    }

}
