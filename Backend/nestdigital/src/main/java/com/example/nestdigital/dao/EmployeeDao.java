package com.example.nestdigital.dao;

import com.example.nestdigital.model.EmployeeModel;
import com.example.nestdigital.model.LMSModel;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface EmployeeDao extends CrudRepository<EmployeeModel,Integer> {

    @Query(value = "SELECT * FROM `employee` WHERE `empid`=:empId",nativeQuery = true)
    List<EmployeeModel> FindEmployee(@Param("empId") int empId);

    @Modifying
    @Transactional
    @Query(value = "DELETE FROM `employee` WHERE `empid`=:empId",nativeQuery = true)
    void DeleteEmployee(@Param("empId") int empId);

    @Query(value="SELECT * FROM `employee` WHERE `username`= :name AND `password`= :pwd ;\n ",nativeQuery = true)
    List<EmployeeModel> EmployeeLogin(@Param("name") String name,@Param("pwd")String pwd);

//    @Query(value="SELECT e.id, e.address, e.designation, e.emp_name, e.empid, e.mail, e.password, e.phone, e.username,  l.apply_date, l.casual_leave, l.from_date, l.leave_type, l.remarks, l.sick_leave, l.status, l.spl_leave, l.to_date FROM `lms` AS l JOIN employee AS e  WHERE CURRENT_DATE  BETWEEN l.`from_date` AND l.`to_date` OR e.username = :name AND e.password = :pwd ; ",nativeQuery = true)
//    List<EmployeeModel> EmployeeLogin(@Param("name") String name,@Param("pwd")String pwd);



}
