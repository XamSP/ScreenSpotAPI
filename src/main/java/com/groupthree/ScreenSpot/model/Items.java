package com.groupthree.ScreenSpot.model;

import com.groupthree.ScreenSpot.Enum.ItemType;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Items {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "item_type")
    private ItemType item_type;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "release_year")
    private int release_year;

    @Column(name = "genre")
    private String genre;

    @Column(name = "season_count")
    private int season_count;

    @Column(name = "director")
    private String director;

    public Items(ItemType item_type, String title, String description, int release_year, String genre, int season_count, String director) {
        this.item_type = item_type;
        this.title = title;
        this.description = description;
        this.release_year = release_year;
        this.genre = genre;
        this.season_count = season_count;
        this.director = director;
    }

    public ItemType getItem_type() {
        return item_type;
    }

    public void setItem_type(ItemType item_type) {
        this.item_type = item_type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Long getId() {
        return id;
    }
}
