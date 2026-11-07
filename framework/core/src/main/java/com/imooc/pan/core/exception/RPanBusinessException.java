package com.imooc.pan.core.exception;

import com.imooc.pan.core.response.ResponseCode;

/**
 * 自定义业务异常
 */
public class RPanBusinessException extends RuntimeException{

    private Integer code;
    private String message;
    public RPanBusinessException(ResponseCode responseCode){
        this.code = responseCode.getCode();
        this.message = responseCode.getDesc();
    }

    public RPanBusinessException(Integer code,String message){
        this.code = code;
        this.message = message;
    }

    public RPanBusinessException(String message){
        this.code = ResponseCode.ERROR_PARAM.getCode();
        this.message =message;
    }

    public RPanBusinessException(){
        this.code = ResponseCode.ERROR_PARAM.getCode();
        this.message = ResponseCode.ERROR_PARAM.getDesc();
    }
}
