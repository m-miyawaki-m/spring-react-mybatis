package com.example.service;

import java.util.List;

import com.example.entity.Employees;

/**
 * Service interface for managing employee data.
 * Provides methods to perform operations related to employees.
 */
public interface IEmployeesService {

    /**
     * Retrieves all employees.
     *
     * @return a list of all employees
     */
    List<Employees> getAllEmployees();

    /**
     * Retrieves an employee by their ID.
     *
     * @param employeeId the ID of the employee to retrieve
     * @return the employee with the specified ID, or null if not found
     */
    Employees getEmployeeById(Integer employeeId);

    /**
     * Retrieves employees by their department ID.
     *
     * @param departmentId the ID of the department
     * @return a list of employees belonging to the specified department
     */
    List<Employees> getEmployeesByDepartmentId(Integer departmentId);

    /**
     * Retrieves an employee by their email address.
     *
     * @param email the email address of the employee to retrieve
     * @return the employee with the specified email address, or null if not found
     */
    Employees getEmployeeByEmail(String email);
}
