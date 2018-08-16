package com.wsp.springboot.logback.logback;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@Controller
public class LogbackController {
    private final static Logger _logger = LoggerFactory.getLogger(LogbackController.class);

    @RequestMapping("/")
    public void index(){
       _logger.info("测试日志开始啦");
    }
}
