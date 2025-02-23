package com.example.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.entity.Employees;
import com.example.mapper.EmployeesMapper;

/**
 * Implementation of the IEmployeesService interface.
 * Provides services to manage employee data.
 */
@Service
public class EmployeesServiceImpl implements IEmployeesService {

    private final EmployeesMapper employeesMapper;

    /**
     * Constructs an EmployeesServiceImpl with the specified EmployeesMapper.
     *
     * @param employeesMapper the mapper to interact with the employee database
     */
    public EmployeesServiceImpl(EmployeesMapper employeesMapper) {
        this.employeesMapper = employeesMapper;
    }

    /**
     * Retrieves all employees.
     *
     * @return a list of all employees
     */
    @Override
    public List<Employees> getAllEmployees() {
        return employeesMapper.findAll();
    }

    /**
     * Retrieves an employee by their ID.
     *
     * @param employeeId the ID of the employee to retrieve
     * @return the employee with the specified ID, or null if not found
     */
    @Override
    public Employees getEmployeeById(Integer employeeId) {
        return employeesMapper.findById(employeeId);
    }

    /**
     * Retrieves employees by their department ID.
     *
     * @param departmentId the ID of the department
     * @return a list of employees belonging to the specified department
     */
    @Override
    public List<Employees> getEmployeesByDepartmentId(Integer departmentId) {
        return employeesMapper.findByDepartmentId(departmentId);
    }

    /**
     * Retrieves an employee by their email address.
     *
     * @param email the email address of the employee to retrieve
     * @return the employee with the specified email address, or null if not found
     */
    @Override
    public Employees getEmployeeByEmail(String email) {
        return employeesMapper.findByEmail(email);
    }
}
