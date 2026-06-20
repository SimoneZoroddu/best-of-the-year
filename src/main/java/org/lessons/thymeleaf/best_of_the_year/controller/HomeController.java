package org.lessons.thymeleaf.best_of_the_year.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {

    public String name = "Simone";

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("name", name);
        return "home";
    }

    /* 
    private Movie  getBestMovies(){
        return 
    }

    private Song  getBestSongs(){
        return 
    } 
    */
}
