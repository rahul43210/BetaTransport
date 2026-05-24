package com.transport.beta.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.http.HttpMethod;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AppResponseMessageDto<T> {

    private Integer resonseCode;
    private String responseMessage;
    private String httpMethod;
    private T response;
    private Boolean connectionSuccessful;


}
