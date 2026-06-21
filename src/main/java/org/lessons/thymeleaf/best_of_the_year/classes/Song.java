package org.lessons.thymeleaf.best_of_the_year.classes;

public class Song {
    private int id;
    private String title;
    private static int counterId = 0;

    public Song(String title) {
        this.id += ++counterId;
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

    public String toString() {
        return String.format("The name of the song is %s", title);
    }
}
