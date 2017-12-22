package com.memorynotfound.thymeleaf.services;

import com.memorynotfound.thymeleaf.model.Photo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/*
Create By: Ron Rith
Create Date: 12/22/2017
*/
public interface PhotoService {
   List<Photo> findAllPhotos();
}
