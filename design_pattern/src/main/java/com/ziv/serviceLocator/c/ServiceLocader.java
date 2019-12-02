package com.ziv.serviceLocator.c;

import com.ziv.serviceLocator.i.Service;

public class ServiceLocader {

    private static Cache cache;

    static {
        cache = new Cache();
    }
    public static Service getService(String jndiName){
        // 去缓存中找
        Service service = cache.getService(jndiName);

        if(service != null){
            return service;
        }
        // 没有就初始化
        InitContext context = new InitContext();

        Service service1 = (Service) context.lookup(jndiName);

        cache.addService(service1);

        return service1;

    }
}
