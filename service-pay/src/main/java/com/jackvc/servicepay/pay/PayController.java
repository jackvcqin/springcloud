package com.jackvc.servicepay.pay;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pay")
public class PayController {

    @RequestMapping("/balance")
    public String balance(){
        return "余额为10000";
    }
}
