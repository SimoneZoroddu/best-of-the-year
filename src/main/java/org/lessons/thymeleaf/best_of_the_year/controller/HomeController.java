package org.lessons.thymeleaf.best_of_the_year.controller;

import org.lessons.thymeleaf.best_of_the_year.classes.Movie;
import org.lessons.thymeleaf.best_of_the_year.classes.Song;
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

    @GetMapping("/movies")
    public String movies(Model model) {
        model.addAttribute(getBestMovies());
        return "movies";
    }

    @GetMapping("/songs")
    public String songs(Model model) {
        model.addAttribute(getBestSongs());
        return "songs";
    }

    private Movie getBestMovies() {
        Movie bestMovies = new Movie("best movie title");
        return bestMovies;
    }

    private Song getBestSongs() {
        Song bestSongs = new Song("best song title");
        return bestSongs;
    }

}
