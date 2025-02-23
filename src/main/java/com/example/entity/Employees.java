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
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 従業員情報
 * </p>
 */
@Getter
@Setter
@TableName("EMPLOYEES")
@Schema(description = "従業員情報")
public class Employees implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "EMPLOYEE_ID", type = IdType.AUTO)
    private Integer employeeId;

    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date hireDate;
    private String jobId;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal salary;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private BigDecimal commissionPct = BigDecimal.ZERO;
    private Integer managerId;
    private Integer departmentId;
}
