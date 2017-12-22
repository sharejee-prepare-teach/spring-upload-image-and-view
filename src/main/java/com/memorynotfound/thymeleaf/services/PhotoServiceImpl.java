package com.memorynotfound.thymeleaf.services;

import com.memorynotfound.thymeleaf.model.Photo;
import com.memorynotfound.thymeleaf.repositories.PhotoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/*
Create By: Ron Rith
Create Date: 12/22/2017
*/
@Service
public class PhotoServiceImpl implements PhotoService {
    @Autowired
    private PhotoRepository photoRepository;


    @Override
    @Transactional
    public List<Photo> findAllPhotos() {
        List<Photo> photos = (List<Photo>) photoRepository.findAll();
        if(photos!=null || photos.size()<5){
            for(int i=0;i<5;i++){
                Photo photo = new Photo();
                photo.setId(Long.valueOf(i));
                photo.setImageName("spring1.jpg");
                photoRepository.save(photo);
            }
        }
        return photos;
    }
}
