package com.fund.platform.base;

import lombok.*;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 响应结果数据实体类
 * create class RespResult.java @version 1.0.0 by @author ChenMJ @date 2021-09-16 17:49:00
 */

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class RespResult<T> implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 返回码
     */
    private String respCode;
    /**
     * 返回码说明
     */
    private String respMess;
    /**
     * 数据集
     */
    private T data;

    public static <T> RespResult<T> succeed(){
        return succeed(null);
    }

    public static <T> RespResult<T> succeed(T data){
        return new RespResult<T>().setRespCode(SystemResultCode.SUCCESS.getCode())
                .setRespMess(SystemResultCode.SUCCESS.getMessage()).setData(data);
    }

    public static <T> RespResult<T> succeed(T data,String message){
        return new RespResult<T>().setRespCode(SystemResultCode.SUCCESS.getCode())
                .setRespMess(message).setData(data);
    }

    public static <T> RespResult<T> failed(String code, String message){
        return new RespResult<T>().setRespCode(code).setRespMess(message);
    }

    public static <T> RespResult<T> serverErr(){
        return new RespResult<T>().setRespCode(SystemResultCode.SERVER_ERROR.getCode())
                .setRespMess(SystemResultCode.SERVER_ERROR.getMessage());
    }
}
