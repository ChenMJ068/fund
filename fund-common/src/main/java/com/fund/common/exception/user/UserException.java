package com.fund.common.exception.user;

import com.fund.common.exception.base.BaseException;

/**
 * 用户信息异常类
 * 
 * create this class  @version 1.0.0 by @author ChenMJ
 */
public class UserException extends BaseException
{
    private static final long serialVersionUID = 1L;

    public UserException(String code, Object[] args)
    {
        super("user", code, args, null);
    }
}
