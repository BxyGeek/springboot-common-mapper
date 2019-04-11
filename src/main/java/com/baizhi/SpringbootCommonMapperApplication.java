package com.baizhi;

import lombok.extern.log4j.Log4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(value = "com.baizhi.dao")
@Log4j
public class SpringbootCommonMapperApplication {

    public static void main(String[] args) {
        
        
        
        
        
        
        
        
        
        
        
        
        
        SpringApplication.run(SpringbootCommonMapperApplication.class, args);
        log.debug("==============");
    }

}
