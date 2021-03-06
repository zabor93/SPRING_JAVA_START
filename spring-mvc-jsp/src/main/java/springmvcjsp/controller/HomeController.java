package springmvcjsp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import springmvcjsp.model.Article;

@Controller
public class HomeController {


    @GetMapping("/")
    String home(Model model) {
        model.addAttribute("helloMessage", "Hello ziomeczku");
        return "index";
    }
}
