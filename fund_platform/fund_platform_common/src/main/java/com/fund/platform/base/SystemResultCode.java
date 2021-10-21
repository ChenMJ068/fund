package com.fund.platform.base;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * create class SystemResultCode.java @version 1.0.0 by @author ChenMJ @date 2021-10-21 16:41:00
 */
@Getter
@AllArgsConstructor
public enum SystemResultCode implements ResultCode{
    /**
     * 成功
     */
    SUCCESS("0000", "处理成功"),
    /**
     * 参数错误
     */
    BAD_REQUEST("2000", "Bad Request"),
    /**
     * 未认证
     */
    UNAUTHORIZED("3000", "Unauthorized"),
    /**
     * 未授权
     */
    FORBIDDEN("4000", "Forbidden"),
    /**
     * 服务异常
     */
    SERVER_ERROR("9999", "Internal Server Error");



    private final String code;

    private final String message;

}
