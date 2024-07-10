package com.example.rest_api.controller;

import com.example.rest_api.model.UserRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/api/v1")
public class ResponseApiController {

    // http://localhost:8080/api/v1
    @GetMapping("")
    public UserRequest user(){

        var user = new UserRequest();
        user.setUserName("홍길동");
        user.setUserAge(10);
        user.setEmail("hong@gmail.com");

        log.info("user : {}", user);

        var response = ResponseEntity
                .status(HttpStatus.BAD_REQUEST)
                .header("x-custom", "hi")
                .body(user);

        return user;
    }
}
