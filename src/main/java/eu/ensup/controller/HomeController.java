package eu.ensup.controller;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(name = "/")
public class HomeController {

    /**
     * View register page string.
     *
     * @return the string
     */
    @GetMapping("home")
    public String viewRegisterPage() {
        return "login";
    }
}
