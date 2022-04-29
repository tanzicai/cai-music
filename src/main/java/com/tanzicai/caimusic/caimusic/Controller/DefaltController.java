package com.tanzicai.caimusic.caimusic.Controller;

import org.apache.logging.log4j.message.StringFormattedMessage;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/testHello")
public class DefaltController {
    @GetMapping
    public String sayHello(){
        return "通信畅通，SpringWeb正常启动，testHello接口正常返回内容";
    }
}

