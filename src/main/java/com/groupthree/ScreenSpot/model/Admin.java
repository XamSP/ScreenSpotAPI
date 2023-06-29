package com.groupthree.ScreenSpot.model;

import com.groupthree.ScreenSpot.Enum.Gender;
import com.groupthree.ScreenSpot.Enum.Role;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "admin")
public class Admin {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String first_name;
    private String last_name;
    private Date DOB;
    private Gender gender;
    private String phone_number;
    private String username;
    private String email;
    private String password_hash;

    private Role role;

}
