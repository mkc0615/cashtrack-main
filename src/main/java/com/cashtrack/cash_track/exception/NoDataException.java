package com.cashtrack.cash_track.exception;

public class NoDataException extends BusinessException{

    public NoDataException(ErrorEnum errorEnum){ super(errorEnum); }

}
