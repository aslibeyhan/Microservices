package com.microservices.productservices.response;

import lombok.Builder;
import lombok.Data;
import org.springframework.http.HttpStatus;

import java.util.List;

@Data
@Builder
public class InternalApiResponse<T> {
    //Generik classlar bir type parametresi alırlar.
    private FriendlyMessage friendlyMessage;
    private T payload;
    private boolean hasError;
    private List<String> errorMessages;
    private HttpStatus httpStatus;


}
