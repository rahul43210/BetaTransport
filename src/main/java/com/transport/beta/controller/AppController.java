package com.transport.beta.controller;

import com.transport.beta.dto.AppResponseMessageDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/home")
public class AppController {


    @GetMapping("/")
    public AppResponseMessageDto applicationStatus(RequestEntity<?> requestEntity) {
        return new AppResponseMessageDto(HttpStatus.OK.value(), "Application is running.",
                requestEntity.getMethod().toString(),
                "App is running", true);
    }

}
