package com.example.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

/**
 * Represents an employee entity with various attributes such as ID, name, email, etc.
 */
@Data
@TableName("EMPLOYEES")
@Schema(description = "従業員情報")
public class Employees implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * The unique identifier for an employee.
     */
    @TableId(value = "EMPLOYEE_ID", type = IdType.AUTO)
    private Integer employeeId;

    /**
     * The first name of the employee.
     */
    private String firstName;

    /**
     * The last name of the employee.
     */
    private String lastName;

    /**
     * The email address of the employee.
     */
    private String email;

    /**
     * The phone number of the employee.
     */
    private String phoneNumber;

    /**
     * The hire date of the employee.
     */
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date hireDate;

    /**
     * The job ID associated with the employee.
     */
    private String jobId;

    /**
     * The salary of the employee.
     */
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal salary;

    /**
     * The commission percentage of the employee, if applicable.
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private BigDecimal commissionPct = BigDecimal.ZERO;

    /**
     * The manager ID of the employee's manager.
     */
    private Integer managerId;

    /**
     * The department ID where the employee works.
     */
    private Integer departmentId;
}
