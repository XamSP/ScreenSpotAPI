package com.groupthree.ScreenSpot.model;

import javax.persistence.*;

@Entity
@Table(name = "RolePermission")
public class RolePermission {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "role_id")
    private int role_id;

    @Column(name = "permission")
    private String permission;

    public RolePermission(int role_id, String permission) {
        this.role_id = role_id;
        this.permission = permission;
    }

    public Long getId() {
        return id;
    }

    public int getRole_id() {
        return role_id;
    }

    public void setRole_id(int role_id) {
        this.role_id = role_id;
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }
}
