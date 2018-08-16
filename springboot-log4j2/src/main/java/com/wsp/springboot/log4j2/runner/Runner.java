package com.wsp.springboot.log4j2.runner;

import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.slf4j.Logger;
@Component
public class Runner implements CommandLineRunner{
    private final Logger _logger = LoggerFactory.getLogger(this.getClass());
    @Override
    public void run(String... strings) throws Exception {
        _logger.info("开始执行啦！！！！");
    }
}
