package com.moodtree.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

@Api(tags = "스웨거 테스트 컨트롤러")
@RestController
@RequestMapping("/swagger")// json 방식으로 응답
public class HomeController {

    @ApiOperation("Get 테스트")
    @GetMapping
    public String home() {
        return "hello";
    }


    @ApiOperation("POST 테스트")
    @PostMapping
    public String testPost(@RequestBody String message) {
        return "받은 메시지: " + message;
    }

}