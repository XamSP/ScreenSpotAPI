package com.groupthree.ScreenSpot.model;

import javax.persistence.*;

@Entity
@Table(name = "user")
public class User {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "email")
    private String email;
    private String password;
    private String first_name;
    private String last_name;
    private String address;
    private String profile_picture;
    private String biography;
    private String facebook_url;
    private String twitter_url;
    private String linkedin_url;
    private String tiktok_url;
    private String instagram_url;
    private String username;

    public User() {
    }

    public User(String email, String password, String first_name, String last_name, String username) {
        this.email = email;
        this.password = password;
        this.first_name = first_name;
        this.last_name = last_name;
        this.username = username;
    }

    public User(Long id, String email, String password, String first_name, String last_name, String address, String username) {
        this.email = email;
        this.password = password;
        this.first_name = first_name;
        this.last_name = last_name;
        this.address = address;
        this.username = username;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getProfile_picture() {
        return profile_picture;
    }

    public void setProfile_picture(String profile_picture) {
        this.profile_picture = profile_picture;
    }

    public String getBiography() {
        return biography;
    }

    public void setBiography(String biography) {
        this.biography = biography;
    }

    public String getFacebook_url() {
        return facebook_url;
    }

    public void setFacebook_url(String facebook_url) {
        this.facebook_url = facebook_url;
    }

    public String getTwitter_url() {
        return twitter_url;
    }

    public void setTwitter_url(String twitter_url) {
        this.twitter_url = twitter_url;
    }

    public String getLinkedin_url() {
        return linkedin_url;
    }

    public void setLinkedin_url(String linkedin_url) {
        this.linkedin_url = linkedin_url;
    }

    public String getTiktok_url() {
        return tiktok_url;
    }

    public void setTiktok_url(String tiktok_url) {
        this.tiktok_url = tiktok_url;
    }

    public String getInstagram_url() {
        return instagram_url;
    }

    public void setInstagram_url(String instagram_url) {
        this.instagram_url = instagram_url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Long getId() {
        return id;
    }

}
