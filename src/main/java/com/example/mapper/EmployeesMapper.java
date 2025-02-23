package com.example.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.example.entity.Employees;

/**
 * Mapper interface for employee operations.
 * Provides methods to perform database operations on employees.
 */
@Mapper
public interface EmployeesMapper {

    /**
     * Retrieves all employees from the database.
     *
     * @return a list of all employees
     */
    List<Employees> findAll();

    /**
     * Retrieves an employee by their ID.
     *
     * @param employeeId the ID of the employee to retrieve
     * @return the employee with the specified ID, or null if not found
     */
    Employees findById(@Param("employeeId") Integer employeeId);

    /**
     * Retrieves employees by their department ID.
     *
     * @param departmentId the ID of the department
     * @return a list of employees belonging to the specified department
     */
    List<Employees> findByDepartmentId(@Param("departmentId") Integer departmentId);

    /**
     * Retrieves an employee by their email address.
     *
     * @param email the email address of the employee to retrieve
     * @return the employee with the specified email address, or null if not found
     */
    Employees findByEmail(@Param("email") String email);
}
