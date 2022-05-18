package com.tanzicai.caimusic.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin
@RestController
@RequestMapping("/testHello")
public class DefaltController {
    @GetMapping
    public String sayHello(){
        return "通信畅通，SpringWeb正常启动，testHello接口正常返回内容";
    }
}

