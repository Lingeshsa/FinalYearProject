package com.example.nestdigital.dao;

import com.example.nestdigital.model.EmployeeLogModel;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface EmployeeLogDao extends CrudRepository<EmployeeLogModel,Integer> {
    @Query(value = "SELECT * FROM `employeeslog` WHERE `id` = :Id ",nativeQuery = true )
    List<EmployeeLogModel> GetEntryTime(@Param("Id") int Id);

@Modifying
@Transactional
    @Query(value = "UPDATE `employeeslog` SET `exit_time`= :employeeExit WHERE `id`= :Id",nativeQuery = true)
    void ExitTime(@Param("Id") int Id,@Param("employeeExit")String employeeExit);


}
