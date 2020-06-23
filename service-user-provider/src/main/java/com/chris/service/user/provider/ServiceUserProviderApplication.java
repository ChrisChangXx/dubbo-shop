package com.chris.service.user.provider;

import com.alibaba.dubbo.container.Main;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ServiceUserProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceUserProviderApplication.class, args);
        //启动Provider容器，这里的是Main是com.alibaba.dubbo.container下的
        Main.main(args);
    }

}
