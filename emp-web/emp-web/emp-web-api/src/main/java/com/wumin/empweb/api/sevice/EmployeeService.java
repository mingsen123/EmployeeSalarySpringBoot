package com.wumin.empweb.api.sevice;

import com.wumin.empweb.api.contants.ResultDTO;


public interface EmployeeService {

    /**
     * 根据员工身份证号精确查找
     * @param idCard 员工身份证号码
     * @return 匹配的数据集
     */
    ResultDTO findByIdCard(String idCard);
}
