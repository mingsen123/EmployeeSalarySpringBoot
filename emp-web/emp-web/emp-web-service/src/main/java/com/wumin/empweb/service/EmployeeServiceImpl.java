package com.wumin.empweb.service;

import com.wumin.empweb.api.contants.ResultDTO;
import com.wumin.empweb.api.enums.HttpCode;
import com.wumin.empweb.api.model.EmployeeDTO;
import com.wumin.empweb.api.sevice.EmployeeService;
import com.wumin.empweb.dao.mapper.EmployeeMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private EmployeeMapper employeeMapper;


    @Override
    public ResultDTO findByIdCard(String idCard) {

        logger.info("入参"+ idCard);

        // 非空判断
            if (StringUtils.isEmpty(idCard)) {
                return new ResultDTO(HttpCode.FAIL.getCode(),"身份证号不能为空");
            }
            // 业务查找
            List<EmployeeDTO> list= employeeMapper.findByIdCard(idCard);
            if (CollectionUtils.isEmpty(list)) {
                return new ResultDTO(HttpCode.FAIL.getCode(), "暂无对应书籍数据");
            }
        logger.info("出参：" + list);
            return new ResultDTO(HttpCode.SUCCESS.getCode(), "查找成功",list);
        }
}

