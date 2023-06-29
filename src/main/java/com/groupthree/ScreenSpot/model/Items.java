package com.groupthree.ScreenSpot.model;

import com.groupthree.ScreenSpot.Enum.ItemType;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Items {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private ItemType item_type;
    private String title;
    private String description;
    private int release_year;
    private String genre;
    private int season_count;
    private String director;
}
