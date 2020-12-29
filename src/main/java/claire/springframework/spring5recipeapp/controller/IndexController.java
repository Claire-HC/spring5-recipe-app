package claire.springframework.spring5recipeapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by claire on 29/12/20
 */
@Controller
public class IndexController {

    @RequestMapping({"","/","/index"})
    public String getIndexPage(){
        return "Index";
    }
}
