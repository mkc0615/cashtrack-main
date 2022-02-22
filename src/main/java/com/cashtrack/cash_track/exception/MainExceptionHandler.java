package com.cashtrack.cash_track.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class MainExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(value={ InvalidParamException.class })
    protected ResponseEntity<ErrorResponse> handleBusinessException(){
        return ErrorResponse.createResponseEntity(ErrorEnum.INVALID_PARAMETER);
    }

    @ExceptionHandler(value={ NoDataException.class })
    protected ResponseEntity<ErrorResponse> handleNoDataException(){
        return ErrorResponse.createResponseEntity(ErrorEnum.DATA_NOT_FOUND);
    }

}
