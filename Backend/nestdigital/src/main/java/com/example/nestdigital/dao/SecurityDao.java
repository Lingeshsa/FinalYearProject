package com.example.nestdigital.dao;

import com.example.nestdigital.model.EmployeeModel;
import com.example.nestdigital.model.SecurityModel;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public interface SecurityDao extends CrudRepository<SecurityModel,Integer> {

    @Query(value = "SELECT * FROM `security` WHERE `secid`= :secuID",nativeQuery = true)
    List<SecurityModel> FindSecurity(@Param("secuID") int secuID);

    @Modifying
    @Transactional
    @Query(value = "DELETE FROM `security` WHERE `secid`=:secuID",nativeQuery = true)
    void DeleteEmployee(@Param("secuID") int secuID);

    @Query(value="SELECT * FROM `security` WHERE `username`= :name AND `password`= :pwd ;\n ",nativeQuery = true)
    List<SecurityModel> SecurityLogin(@Param("name") String name,@Param("pwd")String pwd);


}
