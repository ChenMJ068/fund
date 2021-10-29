package com.fund.common.utils;

/**
 * 处理并记录日志文件
 * 
 * create this class  @version 1.0.0 by @author ChenMJ
 */
public class LogUtils
{
    public static String getBlock(Object msg)
    {
        if (msg == null)
        {
            msg = "";
        }
        return "[" + msg.toString() + "]";
    }
}
