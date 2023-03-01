package com.example.nestdigital.controller;

import com.example.nestdigital.dao.TotalLeaveCountDao;
import com.example.nestdigital.model.TotalLeaveCountModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController public class TotalLeaveCountController {
    @Autowired
    private TotalLeaveCountDao totalLeaveCountDao;

//    @CrossOrigin(origins = "*")
//    @PostMapping(path = "/addTotalLeave",consumes = "application/json",produces = "application/json")
//    void AddTotalLeave(@RequestBody TotalLeaveCountModel totalLeaveCountModel){
//    }
}
