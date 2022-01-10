package com.example.scriptkill;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@MapperScan("com.example.scriptkill.*.dao")
public class
ScriptKillApplication {

    public static void main(String[] args) {
        SpringApplication.run(ScriptKillApplication.class, args);
    }

}
