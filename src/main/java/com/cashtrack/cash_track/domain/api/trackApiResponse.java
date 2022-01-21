package com.cashtrack.cash_track.domain.api;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class trackApiResponse {

    private int status;
    private String message;
    private Object data;

}
