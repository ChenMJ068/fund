package com.fund.platform.exception;

/**
 * create class WorkflowException.java @version 1.0.0 by @author ChenMJ @date 2021-09-16 16:59:00
 */
public class WorkflowException extends BusinessException{

    private final static String WORKFLOW_ERROR = "WORKFLOW_ERROR";

    public WorkflowException(){
        setErrorCode(WORKFLOW_ERROR);
    }

    public WorkflowException(String message){
        super(message);
        setErrorCode(WORKFLOW_ERROR);
    }

    public WorkflowException(String message,Throwable cause) {
        super(message,cause);
        setErrorCode(WORKFLOW_ERROR);
    }

    public WorkflowException(Throwable cause) {
        super(cause);
        setErrorCode(WORKFLOW_ERROR);
    }
}
