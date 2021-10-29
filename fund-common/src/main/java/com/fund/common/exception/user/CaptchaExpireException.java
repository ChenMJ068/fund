package com.fund.common.exception.user;

/**
 * 验证码失效异常类
 * 
 * create this class  @version 1.0.0 by @author ChenMJ
 */
public class CaptchaExpireException extends UserException
{
    private static final long serialVersionUID = 1L;

    public CaptchaExpireException()
    {
        super("user.jcaptcha.expire", null);
    }
}
