package springmvcthymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import springmvcthymeleaf.model.Article;

@Controller
public class HomeController {


    @GetMapping("/")
    String home(Model model) {
        model.addAttribute("helloMessage", "Hello ziomeczku");
        model.addAttribute("formArticle", new Article(("Some title"), "COntent here...", "tag1,tag2,tag3"));
        return "index";
    }
}
