package com.fund.common.exception.file;

import com.fund.common.exception.base.BaseException;

/**
 * 文件信息异常类
 * 
 * create this class  @version 1.0.0 by @author ChenMJ
 */
public class FileException extends BaseException
{
    private static final long serialVersionUID = 1L;

    public FileException(String code, Object[] args)
    {
        super("file", code, args, null);
    }

}
