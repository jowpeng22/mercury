package com.joemaster.userservice.exception;

import com.joemaster.common.dto.RespDTO;
import com.joemaster.common.exception.CommonException;
import com.joemaster.common.exception.ErrorCode;
import com.joemaster.common.util.HttpConstant;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Create by pengzq on 2020-7-13
 */
@ControllerAdvice
@ResponseBody
public class CommonExceptionHandler {

    @ExceptionHandler(CommonException.class)
    public ResponseEntity handleException(Exception e) {
        RespDTO resp = new RespDTO();
        CommonException commonException = (CommonException) e;
        resp.error = e.getMessage();
        resp.code = commonException.getCode();
        return new ResponseEntity(resp, HttpStatus.OK);
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity argumentHandleException(MethodArgumentNotValidException e) {
        RespDTO resp = new RespDTO();
        resp.code = ErrorCode.BAD_PARAMETER.getCode();
        resp.error = ErrorCode.BAD_PARAMETER.getMsg();
        return new ResponseEntity(resp, HttpStatus.OK);
    }
}
