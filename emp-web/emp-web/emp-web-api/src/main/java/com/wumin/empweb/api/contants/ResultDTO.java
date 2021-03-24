package com.wumin.empweb.api.contants;


import lombok.Data;

/**
 * 基本返回数据结构
 */
@Data
public class ResultDTO {

    /**
     * 系统名称
     */
    private String system;

    /**
     * 返回类型
     */
    private int code;

    /**
     * 返回类型明细
     */
    private String msg;



    private Object date;
    public ResultDTO(int code, String msg) {
        this.system = "employee";
        this.code = code;
        this.msg = msg;
    }

    public ResultDTO(int code, String msg, Object date) {
        this.system = "employee";
        this.code = code;
        this.msg = msg;
        this.date = date;
    }


}
