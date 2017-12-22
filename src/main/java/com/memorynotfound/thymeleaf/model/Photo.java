package com.memorynotfound.thymeleaf.model;

import javax.persistence.*;

/*
Create By: Ron Rith
Create Date: 12/22/2017
*/
@Entity
@Table(name = "photo")
public class Photo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String imageName;

    public Photo(String imageName) {
        this.imageName = imageName;
    }

    public Photo() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    @Override
    public String toString() {
        return "Photo{" +
                "id=" + id +
                ", imageName='" + imageName + '\'' +
                '}';
    }
}

