package com.wumin.empweb.dao.mapper;





import com.wumin.empweb.api.model.EmployeeDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 员工实体信息接口
 */
@Mapper
public interface EmployeeMapper {

    /**
     *根据员工身份证号查找
     * @param idCard 员工身份证号
     * @return 匹配的数据集
     */
    List<EmployeeDTO> findByIdCard(String idCard);
}
