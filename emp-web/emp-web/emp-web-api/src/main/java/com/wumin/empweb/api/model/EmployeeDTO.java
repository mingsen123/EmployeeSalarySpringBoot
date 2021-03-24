package com.wumin.empweb.api.model;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
public class EmployeeDTO implements Serializable {


    private static final long serialVersionUID = 8248592779053476389L;
    /**
     * 数据主键
     */
    private int id;

    /**
     * 员工工号
     */
    private String employeeId;

    /**
     * 员工姓名
     */
    private String employeeName;

    /**
     * 身份证号码
     */
    private String idCard;

    /**
     * 联系方式
     */
    private int phone;

    /**
     * 开户行
     */
    private String bank;

    /**
     * 银行卡号
     */
    private int bankNumber;

    /**
     * 薪资归属月
     */
    private String month;

    /**
     * 当月薪水
     */
    private BigDecimal salary;

    /**
     * 临时字段1
     */
    private String tmp1;

    /**
     * 临时字段2
     */
    private String tmp2;

}
