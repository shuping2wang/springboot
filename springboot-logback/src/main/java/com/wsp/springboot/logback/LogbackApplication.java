package com.wsp.springboot.logback;

        import org.slf4j.Logger;
        import org.slf4j.LoggerFactory;
        import org.springframework.boot.SpringApplication;
        import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class LogbackApplication {
    private final static Logger _logger = LoggerFactory.getLogger(LogbackApplication.class);

    public static void main(String[] args){
        SpringApplication.run(LogbackApplication.class,args);
        for (int i=0;i<10;i++){
            _logger.info("this is springboot main");
        }
    }
}
