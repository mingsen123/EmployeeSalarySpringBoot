package com.wumin.empweb.web;

import com.wumin.empweb.api.contants.ResultDTO;
import com.wumin.empweb.api.enums.HttpCode;
import com.wumin.empweb.api.model.EmployeeDTO;
import com.wumin.empweb.api.sevice.EmployeeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/employee")
public class EmployeeController {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping("/findByIdCard")
    public ResultDTO findByIdCard(@RequestBody EmployeeDTO employeeDTO) {
        try {
            return employeeService.findByIdCard(employeeDTO.getIdCard());
        } catch (Exception e) {
            return new ResultDTO(HttpCode.EXCEPTION.getCode(), "系统异常");
        }
    }
}
