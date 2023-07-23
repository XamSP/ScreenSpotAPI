package com.groupthree.ScreenSpot.model;

import javax.persistence.*;

@Entity
@Table(name = "tvshow")
public class TVShow {

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

    @Column(name = "season_count")
    private int season_count;

    public TVShow(String title, int release_year, String genre, int season_count) {
        this.title = title;
        this.release_year = release_year;
        this.genre = genre;
        this.season_count = season_count;
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

    public int getSeason_count() {
        return season_count;
    }

    public void setSeason_count(int season_count) {
        this.season_count = season_count;
    }

    public Long getId() {
        return id;
    }
}
