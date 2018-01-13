package com.arya.demo.comsumer.controller;

import com.arya.demo.provider.service.DemoService;
import com.yoku.arya.annotation.RpcConsumer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author HODO
 * @date 2018/1/4
 */
@Controller
@RequestMapping
public class DemoController {

    @RpcConsumer
    private DemoService demoService;


    @RequestMapping("/demo")
    @ResponseBody
    public String demo() {
        return String.valueOf(demoService.count(12));
    }

}
