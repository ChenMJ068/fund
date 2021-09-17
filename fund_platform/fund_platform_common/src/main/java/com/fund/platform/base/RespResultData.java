package com.fund.platform.base;

import lombok.Data;

/**
 * 响应结果数据实体类
 * create class RespResultData.java @version 1.0.0 by @author ChenMJ @date 2021-09-16 17:49:00
 */

@Data
public class RespResultData {
    /**
     * 返回码
     */
    private String respCode;
    /**
     * 返回码说明
     */
    private String respMessage;
    /**
     * 数据集
     */
    private Object data;
}
