package projeto.web.beytrabalho3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PagesController {
	@RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {
        return "index";
    }
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login() {
        return "login";
    }
}
