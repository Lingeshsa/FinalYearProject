package com.example.nestdigital.controller;

import com.example.nestdigital.dao.LMSDao;
import com.example.nestdigital.dao.TotalLeaveCountDao;
import com.example.nestdigital.model.LMSModel;
import com.example.nestdigital.model.TotalLeaveCountModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

@RestController
public class LMSController {
    @Autowired
    private LMSDao lmsDao;
    @Autowired
    private TotalLeaveCountDao totalLeaveCountDao;



    @CrossOrigin(origins = "*")
    @PostMapping(path = "/addLeaveForm",consumes = "application/json",produces = "application/json")
    HashMap<String,String> AddLeave(@RequestBody LMSModel lmsModel){
        HashMap<String,String> map =new HashMap<>();
        lmsDao.save(lmsModel);
        map.put("status","success");
        return  map;
    }
    @CrossOrigin(origins = "*")
    @PostMapping(path = "/leaveHandle",consumes = "application/json",produces = "application/json")
    List<LMSModel> CountLeaveDays(@RequestBody LMSModel lmsModel) throws ParseException {
        List<LMSModel> result=lmsDao.CountLeave(String.valueOf(lmsModel.getId()));
        System.out.println(lmsModel.getId());
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date=new Date();
        Date date1 = null;
        Date date2=null;
        String startDate=result.get(0).getFromDate();
        String enddate=result.get(0).getToDate();
        date1=simpleDateFormat.parse(startDate);
        date2=simpleDateFormat.parse(enddate);
        long getDiff = date2.getTime() - date1.getTime();
        long getDaysDiff = TimeUnit.MILLISECONDS.toDays(getDiff)+1;
        System.out.println(getDaysDiff);
        System.out.println(result.get(0).getLeaveType());
        if((result.get(0).getLeaveType().equals("casualLeave"))){
            if(result.get(0).getCasualLeave()>=getDaysDiff){
                System.out.println(result.get(0).getId());
                lmsDao.CasualDecreaseLeave(String.valueOf(result.get(0).getEmpid()), (int) getDaysDiff);
            }else{
                lmsDao.LeaveDecisionReject(lmsModel.getId());
            }
        } else if((result.get(0).getLeaveType().equals("sickLeave"))){
            if(result.get(0).getSickLeave()>=getDaysDiff){
                System.out.println(result.get(0).getId());
                lmsDao.SickDecreaseLeave(String.valueOf(result.get(0).getEmpid()), (int) getDaysDiff);
            }else{
                lmsDao.LeaveDecisionReject(lmsModel.getId());
            }
        }else if((result.get(0).getLeaveType().equals("splLeave"))){
            if(result.get(0).getSickLeave()>=getDaysDiff){
                System.out.println(result.get(0).getId());
                System.out.println("Granted");
                lmsDao.SpecailDecreaseLeave(String.valueOf(result.get(0).getEmpid()), (int) getDaysDiff);
            }else{
                lmsDao.LeaveDecisionReject(lmsModel.getId());
            }
        }
        return (List<LMSModel>) result;
    }
    @CrossOrigin(origins = "*")
    @PostMapping(path = "/viewAllEmployeeLeaveReq",consumes = "application/json",produces = "application/json")
    List<LMSModel>ViewAllEmployeeReq(@RequestBody LMSModel lmsModel){
       List<LMSModel> result=lmsDao.ViewAllEmployeeLeaveReq();
        return result;
    }

   @CrossOrigin(origins = "*")
    @PostMapping(path="/checkLeave",consumes = "application/json",produces = "application/json")
   List<LMSModel> CheckLeave(@RequestBody LMSModel lmsModel){
       List<LMSModel> result=lmsDao.CheckLeave(lmsModel.getId());
        return result;
   }
    @CrossOrigin(origins = "*")
    @PostMapping(path="/leaveDecisionGrant",consumes = "application/json",produces = "application/json")
    void LeaveDecisionGrant(@RequestBody LMSModel lmsModel){
         lmsDao.LeaveDecisionGrant(lmsModel.getId());

    }
    @CrossOrigin(origins = "*")
    @PostMapping(path="/leaveDecisionReject",consumes = "application/json",produces = "application/json")
    void LeaveDecisionReject(@RequestBody LMSModel lmsModel){
        lmsDao.LeaveDecisionReject(lmsModel.getId());
    }

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/employeeLoginEntry",produces = "application/json",consumes = "application/json")
    public List<LMSModel> EmployeeLoginEntry(@RequestBody LMSModel lmsModel)
    {
        List<LMSModel> result= lmsDao.employeeLoginEntry(  lmsModel.getEmpid());
        System.out.println(result);
        return result;

    }
}
