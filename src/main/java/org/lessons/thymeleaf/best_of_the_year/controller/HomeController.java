package org.lessons.thymeleaf.best_of_the_year.controller;

import java.util.ArrayList;

import org.lessons.thymeleaf.best_of_the_year.classes.Movie;
import org.lessons.thymeleaf.best_of_the_year.classes.Song;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
        model.addAttribute("bestMovies", getBestMovies());
        return "movies";
    }
    @GetMapping("/movies/{id}")
    public String moviesId(@PathVariable("id") String id ,Model model) {
        model.addAttribute("bestMovies", getBestMovies());
        return "movies";
    }

    @GetMapping("/songs")
    public String songs(Model model) {
        model.addAttribute("bestSongs", getBestSongs());
        return "songs";
    }
    @GetMapping("/songs/{id}")
    public String songsId(Model model) {
        model.addAttribute("bestSongs", getBestSongs());
        return "songs";
    }

    private ArrayList<Movie> getBestMovies() {
        ArrayList<Movie> movies = new ArrayList<>();
        movies.add(new Movie("best movie title"));
        movies.add(new Movie("best second movie title"));
        return movies;
    }

    private ArrayList<Song> getBestSongs() {
        ArrayList<Song> songs = new ArrayList<>();
        songs.add(new Song("best song title"));
        songs.add(new Song("best second song title"));
        return songs;
    }

}
