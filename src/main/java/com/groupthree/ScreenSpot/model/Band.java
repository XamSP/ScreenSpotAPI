package com.groupthree.ScreenSpot.model;

import javax.persistence.*;

@Entity
@Table(name = "band")
public class Band {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "genre")
    private String genre;

    @Column(name = "year_formed")
    private int year_formed;

    public Band(String name, String genre, int year_formed) {
        this.name = name;
        this.genre = genre;
        this.year_formed = year_formed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getYear_formed() {
        return year_formed;
    }

    public void setYear_formed(int year_formed) {
        this.year_formed = year_formed;
    }

    public Long getId() {
        return id;
    }
}
