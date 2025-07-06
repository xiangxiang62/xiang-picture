package com.xiang.xiangpicturebackend;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@MapperScan("com.xiang.xiangpicturebackend.mapper")
@EnableAspectJAutoProxy(exposeProxy = true)
public class XiangPictureBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(XiangPictureBackendApplication.class, args);
    }

}
