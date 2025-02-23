package com.example.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Employees;
import com.example.service.IEmployeesService;

@RestController
@RequestMapping("/employees")
public class EmployeesController {

    private final IEmployeesService employeesService;

    public EmployeesController(IEmployeesService employeesService) {
        this.employeesService = employeesService;
    }

    // 全従業員を取得
    @GetMapping
    public List<Employees> getAllEmployees() {
        return employeesService.getAllEmployees();
    }

    // IDで従業員を取得
    @GetMapping("/{id}")
    public Employees getEmployeeById(@PathVariable("id") Integer id) {
        return employeesService.getEmployeeById(id);
    }

    // 部署IDで従業員を取得
    @GetMapping("/department/{departmentId}")
    public List<Employees> getEmployeesByDepartmentId(@PathVariable("departmentId") Integer departmentId) {
        return employeesService.getEmployeesByDepartmentId(departmentId);
    }

    // メールで従業員を取得
    @GetMapping("/email/{email}")
    public Employees getEmployeeByEmail(@PathVariable("email") String email) {
        return employeesService.getEmployeeByEmail(email);
    }
}
