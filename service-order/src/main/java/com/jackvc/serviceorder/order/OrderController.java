package com.jackvc.serviceorder.order;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/order")
public class OrderController {

    @RequestMapping("/list")
    public String list(){
        return UUID.randomUUID().toString();
    }
}
