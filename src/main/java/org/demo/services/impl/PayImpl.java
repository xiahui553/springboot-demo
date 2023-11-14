package org.demo.services.impl;

import org.demo.services.DemoServices;
import org.springframework.stereotype.Service;

@Service
public class PayImpl implements DemoServices {
    public String pay() {
        return "支付成功";
    }

    public String getResult() {
        return "支付成功";

    }
}
