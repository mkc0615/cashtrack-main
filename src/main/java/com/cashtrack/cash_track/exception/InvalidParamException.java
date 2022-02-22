package com.cashtrack.cash_track.exception;

public class InvalidParamException extends BusinessException{

    public InvalidParamException(ErrorEnum errorEnum){ super(errorEnum); }

}
