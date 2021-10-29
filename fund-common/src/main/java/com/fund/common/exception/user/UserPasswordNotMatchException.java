package com.fund.common.exception.user;

/**
 * 用户密码不正确或不符合规范异常类
 * 
 * create this class  @version 1.0.0 by @author ChenMJ
 */
public class UserPasswordNotMatchException extends UserException
{
    private static final long serialVersionUID = 1L;

    public UserPasswordNotMatchException()
    {
        super("user.password.not.match", null);
    }
}
