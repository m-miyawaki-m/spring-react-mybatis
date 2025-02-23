package com.example.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.example.entity.Employees;

@Mapper
public interface EmployeesMapper {
    List<Employees> findAll();
    
    Employees findById(@Param("employeeId") Integer employeeId);
    
    List<Employees> findByDepartmentId(@Param("departmentId") Integer departmentId);
    
    Employees findByEmail(@Param("email") String email);
}
