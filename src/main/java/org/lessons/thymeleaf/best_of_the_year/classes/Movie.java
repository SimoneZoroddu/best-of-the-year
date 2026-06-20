package org.lessons.thymeleaf.best_of_the_year.classes;

public class Movie {
    private int id;
    private String title;

    public Movie(String title) {
        this.id += 1;
        this.title = title;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String toString(){
        return String.format("The name of the song is %s", title);
    }
}
