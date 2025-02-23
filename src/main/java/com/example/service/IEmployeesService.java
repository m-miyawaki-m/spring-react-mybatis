package com.example.service;

import java.util.List;

import com.example.entity.Employees;

public interface IEmployeesService {
    List<Employees> getAllEmployees();
    Employees getEmployeeById(Integer employeeId);
    List<Employees> getEmployeesByDepartmentId(Integer departmentId);
    Employees getEmployeeByEmail(String email);
}
