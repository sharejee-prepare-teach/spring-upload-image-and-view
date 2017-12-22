package com.memorynotfound.thymeleaf.repositories;

import com.memorynotfound.thymeleaf.model.Photo;
import org.springframework.data.jpa.repository.JpaRepository;

/*
Create By: Ron Rith
Create Date: 12/22/2017
*/
public interface PhotoRepository extends JpaRepository<Photo,Long>{
}
