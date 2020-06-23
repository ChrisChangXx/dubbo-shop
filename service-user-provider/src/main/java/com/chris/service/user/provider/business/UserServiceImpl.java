package com.chris.service.user.provider.business;

import com.alibaba.dubbo.config.annotation.Service;
import com.chris.service.user.api.business.UserService;

@Service(version = "${user.service.version}")
public class UserServiceImpl implements UserService {
    @Override
    public String sayHi() {
        return "Hello Dubbo";
    }
}
