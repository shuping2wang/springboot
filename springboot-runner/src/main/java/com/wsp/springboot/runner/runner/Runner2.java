package com.wsp.springboot.runner.runner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(value = 2)
public class Runner2 implements CommandLineRunner {
    private Logger _logger= LoggerFactory.getLogger(this.getClass());
    @Override
    public void run(String... strings) throws Exception {
        _logger.info("服务启动时程序开始执行啦Runner2。。。");

    }
}
