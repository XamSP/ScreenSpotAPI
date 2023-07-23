package com.groupthree.ScreenSpot.model;

import com.groupthree.ScreenSpot.Enum.StarRating;

import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;

@Entity
@Table(name = "ratings")
public class Ratings {


    @Column(name = "stars")
    private int stars;

    @Column(name = "user_id")
    private int user_id;

    @Column(name = "item_id")
    private int item_id;

    @Column(name = "rating")
    private BigDecimal rating;

    @Column(name = "created_at")
    private Timestamp created_at;

    public Ratings(int stars, int user_id, int item_id, BigDecimal rating, Timestamp created_at) {
        this.stars = stars;
        this.user_id = user_id;
        this.item_id = item_id;
        this.rating = rating;
        this.created_at = created_at;
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getItem_id() {
        return item_id;
    }

    public void setItem_id(int item_id) {
        this.item_id = item_id;
    }

    public BigDecimal getRating() {
        return rating;
    }

    public void setRating(BigDecimal rating) {
        this.rating = rating;
    }

    public Timestamp getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Timestamp created_at) {
        this.created_at = created_at;
    }
}
