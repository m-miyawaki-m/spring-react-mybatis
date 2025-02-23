package com.example.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Employees;
import com.example.service.IEmployeesService;
/**
 * Controller for handling employee-related requests.
 */
@RestController
@RequestMapping("/employees")
public class EmployeesController {

    private final IEmployeesService employeesService;

    /**
     * Constructs an EmployeesController with the specified service.
     *
     * @param employeesService the service to handle employee operations
     */
    public EmployeesController(IEmployeesService employeesService) {
        this.employeesService = employeesService;
    }

    /**
     * Retrieves all employees.
     *
     * @return a list of all employees
     */
    @GetMapping
    public List<Employees> getAllEmployees() {
        return employeesService.getAllEmployees();
    }

    /**
     * Retrieves an employee by their ID.
     *
     * @param id the ID of the employee to retrieve
     * @return the employee with the specified ID
     */
    @GetMapping("/{id}")
    public Employees getEmployeeById(@PathVariable("id") Integer id) {
        return employeesService.getEmployeeById(id);
    }

    /**
     * Retrieves employees by their department ID.
     *
     * @param departmentId the ID of the department
     * @return a list of employees belonging to the specified department
     */
    @GetMapping("/department/{departmentId}")
    public List<Employees> getEmployeesByDepartmentId(@PathVariable("departmentId") Integer departmentId) {
        return employeesService.getEmployeesByDepartmentId(departmentId);
    }

    /**
     * Retrieves an employee by their email address.
     *
     * @param email the email address of the employee to retrieve
     * @return the employee with the specified email address
     */
    @GetMapping("/email/{email}")
    public Employees getEmployeeByEmail(@PathVariable("email") String email) {
        return employeesService.getEmployeeByEmail(email);
    }

}
