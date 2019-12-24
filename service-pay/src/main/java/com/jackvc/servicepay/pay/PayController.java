package com.jackvc.servicepay.pay;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pay")
public class PayController {

    private Logger logger = LoggerFactory.getLogger(PayController.class);

    @RequestMapping("/balance")
    public String balance(){
        String resultStr = "余额为"+(int)(Math.random()*100000);
        logger.info("----log-----"+resultStr+"--------");
        return resultStr;
    }
}
