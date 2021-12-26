package com.example.scriptkill;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

@SpringBootApplication
@MapperScan("com.example.scriptkill.*.dao")
public class ScriptKillApplication {

    public static void main(String[] args) {
        SpringApplication.run(ScriptKillApplication.class, args);
    }

}
