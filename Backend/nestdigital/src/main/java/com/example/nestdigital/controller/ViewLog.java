package com.example.nestdigital.controller;

import com.example.nestdigital.dao.ViewLogDao;
import com.example.nestdigital.model.SecurityModel;
import com.example.nestdigital.model.ViewLogModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class ViewLog {
    @Autowired
    private ViewLogDao viewLogDao;

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/vistersLog",consumes = "application/json",produces = "application/json")
    HashMap<String,String> VistersLog(@RequestBody ViewLogModel viewLogModel){
        HashMap<String,String> map =new HashMap<>();
        viewLogDao.save(viewLogModel);
        map.put("status","success");
        return  map;

    }
}
