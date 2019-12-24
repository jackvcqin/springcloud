package com.jackvc.servicepay.pay;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pay")
public class PayController {

    @RequestMapping("/balance")
    public String balance(){
        String resultStr = "余额为"+(int)(Math.random()*100000);
        System.out.println("---------"+resultStr+"--------");
        return resultStr;
    }
}
