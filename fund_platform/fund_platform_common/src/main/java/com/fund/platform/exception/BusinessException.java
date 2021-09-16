package com.fund.platform.exception;

/**
 * create class BusinessException.java @version 1.0.0 by @author ChenMJ @date 2021-09-16 17:00:00
 */
public abstract class BusinessException extends Exception{

    private String errorCode;

    public BusinessException(){
        super();
    }

    public BusinessException(String message){
        super(message);
    }

    public BusinessException(String message,Throwable cause) {
        super(message,cause);
    }

    public BusinessException(Throwable cause) {
        super(cause);
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }
}
