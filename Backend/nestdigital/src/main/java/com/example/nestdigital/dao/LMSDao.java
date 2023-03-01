package com.example.nestdigital.dao;

import com.example.nestdigital.model.LMSModel;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface LMSDao extends CrudRepository<LMSModel,Integer> {
    @Query(value ="SELECT l.id ,l.apply_date, l.empid, l.from_date, l.leave_type, l.remarks, l.status, l.to_date,c.casual_leave,c.sick_leave,c.spl_leave FROM lms AS l JOIN leavecount AS c ON c.empid=l.empid WHERE l.id= :empId ;", nativeQuery = true)
    List<LMSModel> CountLeave(@Param("empId") String empId);

//    @Modifying
//    @Transactional
//    @Query(value="UPDATE `lms` SET `status`= :sts WHERE `id`= :i",nativeQuery = true)
//    void LeaveDecision(@Param("sts") int sts,@Param("i") int i);


    @Query(value ="SELECT l.id,c.casual_leave,c.sick_leave,c.spl_leave,l.status,l.from_date,l.to_date,l.apply_date,l.leave_type,l.remarks,l.empid FROM `lms` AS l  JOIN leavecount as c on l.empid=c.empid;", nativeQuery = true)
    List<LMSModel> ViewAllEmployeeLeaveReq();

    @Modifying
    @Transactional
    @Query(value = "UPDATE `leavecount` SET casual_leave = casual_leave - :diffDays   WHERE `empid`= :empId",nativeQuery = true)
    void CasualDecreaseLeave(@Param("empId")String empId,@Param("diffDays")int diffDays);

    @Modifying
    @Transactional
    @Query(value = "UPDATE `leavecount` SET sick_leave = sick_leave - :diffDays   WHERE `empid`= :empId",nativeQuery = true)
    void SickDecreaseLeave(@Param("empId")String empId,@Param("diffDays")int diffDays);

    @Modifying
    @Transactional
    @Query(value = "UPDATE `leavecount` SET spl_leave = spl_leave - :diffDays   WHERE `empid`= :empId",nativeQuery = true)
    void SpecailDecreaseLeave(@Param("empId")String empId,@Param("diffDays")int diffDays);

    @Query(value ="SELECT l.id ,l.apply_date, l.empid, l.from_date, l.leave_type, l.remarks, l.status, l.to_date,c.casual_leave,c.sick_leave,c.spl_leave FROM lms AS l JOIN leavecount AS c ON c.empid=l.empid WHERE l.id= :empId ;", nativeQuery = true)
    List<LMSModel> CheckLeave(@Param("empId")int empId);


    @Modifying
    @Transactional
    @Query(value ="UPDATE `lms` SET `status`='Granted' WHERE `id`= :empId ;", nativeQuery = true)
    void LeaveDecisionGrant(@Param("empId")int empId);


    @Modifying
    @Transactional
    @Query(value ="UPDATE `lms` SET `status`='Rejected' WHERE `id`= :empId ;", nativeQuery = true)
    void LeaveDecisionReject(@Param("empId")int empId);

    @Query(value = "SELECT * FROM `lms` WHERE `empid`= :empId AND CURRENT_DATE BETWEEN `from_date` and`to_date`;",nativeQuery = true)
    List<LMSModel> employeeLoginEntry(@Param("empId") int empId);
}
