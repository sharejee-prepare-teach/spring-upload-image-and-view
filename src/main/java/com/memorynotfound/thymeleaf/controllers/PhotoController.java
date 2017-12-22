package com.memorynotfound.thymeleaf.controllers;

import com.memorynotfound.thymeleaf.services.PhotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/*
Create By: Ron Rith
Create Date: 12/22/2017
*/
@Controller
public class PhotoController {
    @Autowired
    private PhotoService photoService;

    @RequestMapping(value = "/getPhotos")
    private ModelAndView getAllPhotos(){
       return new ModelAndView("/home","photos", photoService.findAllPhotos());
    }
}
