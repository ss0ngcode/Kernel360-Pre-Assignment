package com.example.rest_api.controller;

import com.example.rest_api.model.BookRequest;
import com.example.rest_api.model.UserRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class PostApiController {

    // http://localhost:8080/api/post
    @PostMapping("/post")
    public String post(@RequestBody BookRequest bookRequest){
        System.out.println(bookRequest);
        return bookRequest.toString();
    }

    // Request로 사용자의 이름, 나이, 이메일을 받은 POST Method 만들기
    @PostMapping("/user")
    public UserRequest user(@RequestBody UserRequest userRequest){
        System.out.println(userRequest);

        return userRequest;
    }
}
