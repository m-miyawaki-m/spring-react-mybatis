package com.example.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.entity.Employees;
import com.example.mapper.EmployeesMapper;

@Service
public class EmployeesServiceImpl implements IEmployeesService {

    private final EmployeesMapper employeesMapper;

    public EmployeesServiceImpl(EmployeesMapper employeesMapper) {
        this.employeesMapper = employeesMapper;
    }

    @Override
    public List<Employees> getAllEmployees() {
        return employeesMapper.findAll();
    }

    @Override
    public Employees getEmployeeById(Integer employeeId) {
        return employeesMapper.findById(employeeId);
    }

    @Override
    public List<Employees> getEmployeesByDepartmentId(Integer departmentId) {
        return employeesMapper.findByDepartmentId(departmentId);
    }

    @Override
    public Employees getEmployeeByEmail(String email) {
        return employeesMapper.findByEmail(email);
    }
}
