package com.example.nestdigital.controller;

import com.example.nestdigital.dao.EmployeeDao;
import com.example.nestdigital.dao.SecurityDao;
import com.example.nestdigital.model.EmployeeModel;
import com.example.nestdigital.model.SecurityModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
public class SecurityController {
    @Autowired
    private SecurityDao securityDao;
    @CrossOrigin(origins = "*")
    @PostMapping(path = "/addSecurity",consumes = "application/json",produces = "application/json")
    HashMap<String,String> AddSecurity(@RequestBody SecurityModel securityModel){
        HashMap<String,String> map =new HashMap<>();
        securityDao.save(securityModel);
        map.put("status","success");
        return  map;
    }
    @CrossOrigin(origins = "*")
    @GetMapping(path="/viewSecurity")
    List<SecurityModel> ViewSecurity(){
        return (List<SecurityModel>) securityDao.findAll();
    }

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/searchSecurity",produces = "application/json",consumes = "application/json")
     List<SecurityModel> SearchEmployee(@RequestBody SecurityModel securityModel  )
    {
        return (List<SecurityModel>) securityDao.FindSecurity(securityModel.getSecID());
    }

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/deleteSecurity",produces = "application/json",consumes = "application/json")
    public HashMap<String,String> DeleteSecurity(@RequestBody SecurityModel securityModel)
    {
        String eid=String.valueOf(securityModel.getSecID());

        securityDao.DeleteEmployee(securityModel.getSecID());

        HashMap<String,String> map=new HashMap<>();

        map.put("status","employee deleted");

        return map;
    }

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/securityLogin",produces = "application/json",consumes = "application/json")
    public HashMap<String,String> SecurityLogin(@RequestBody SecurityModel securityModel)
    {
        HashMap<String,String> map =new HashMap<>();
        String ename=String.valueOf(securityModel.getUsername());
        String pwd=String.valueOf(securityModel.getPassword());
        List<SecurityModel> result= securityDao.SecurityLogin(ename,pwd);
        if(result.size()==0){
            map.put("status","failed");
            map.put("message","user doesn't exist");
        }
        else{
            int id =result.get(0).getSecID();
            System.out.println(id);
            map.put("userid",String.valueOf(id));
            map.put("status","success");
            map.put("message","user login success");
        }
        return map;
    }




}
