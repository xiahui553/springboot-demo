package org.demo.services;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    private static Log logger = LogFactory.getLog(Controller.class);
    //    private Logger logger = LoggerFactory.getLogger(PayController.class);
    @Autowired
    private DemoServices payServices;
    @RequestMapping("/pay")
    public String pay(String orderNo,String mon){
        logger.info("开始支付");
        return payServices.pay();
    }
    @RequestMapping("/getResult")
    public String  getResult(){
        logger.info("查询支付结果");
        return payServices.getResult();
    }
    @RequestMapping("/getResultbyID")
    public String  getResultById(){
        logger.info("查询支付结果");
        return "没查到结果";
    }
    @RequestMapping("/geALl")
    public String  getAll(){
        logger.info("查询支付结果");
        return "异常";
    }
}
