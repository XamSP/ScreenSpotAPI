package com.groupthree.ScreenSpot.model;

import javax.persistence.*;

@Entity
@Table(name = "movie")
public class Movie {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "release_year")
    private int release_year;

    @Column(name = "genre")
    private String genre;

    @Column(name = "director")
    private String director;

    public Movie(Long id, String title, int release_year, String genre, String director) {
        this.title = title;
        this.release_year = release_year;
        this.genre = genre;
        this.director = director;
    }

    public Movie(String title, int release_year, String genre, String director) {
        this.title = title;
        this.release_year = release_year;
        this.genre = genre;
        this.director = director;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getRelease_year() {
        return release_year;
    }

    public void setRelease_year(int release_year) {
        this.release_year = release_year;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
}
