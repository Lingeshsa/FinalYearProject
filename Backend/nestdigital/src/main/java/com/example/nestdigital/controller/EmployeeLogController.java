package com.example.nestdigital.controller;

import com.example.nestdigital.dao.EmployeeLogDao;
import com.example.nestdigital.model.EmployeeLogModel;
import com.example.nestdigital.model.SecurityModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
public class EmployeeLogController {

    @Autowired
    private EmployeeLogDao employeeLogDao;

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/employeeEntry",consumes = "application/json",produces = "application/json")
    HashMap<String,String> EmployeeEntry(@RequestBody EmployeeLogModel employeeLogModel){
        HashMap<String,String > map =new HashMap<>();
        employeeLogDao.save(employeeLogModel);
        map.put("status","success");
        map.put("id",String.valueOf(employeeLogModel.getId()));
        return map;
    }
    @CrossOrigin(origins = "*")
    @PostMapping(path = "/employeeExit",consumes = "application/json",produces = "application/json")
    HashMap<String,String> EmployeeExit(@RequestBody EmployeeLogModel employeeLogModel){
        HashMap<String,String > map =new HashMap<>();
        employeeLogDao.ExitTime(employeeLogModel.getId(), employeeLogModel.getExitTime() );
        map.put("status","success");
        return map;
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/viewEmployeesLog")
    public List<EmployeeLogModel> ViewEmployeeLog()
    {
        return (List<EmployeeLogModel>) employeeLogDao.findAll();
    }
}
