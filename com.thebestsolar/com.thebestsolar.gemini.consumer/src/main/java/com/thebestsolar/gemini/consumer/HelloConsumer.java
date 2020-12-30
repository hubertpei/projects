package com.thebestsolar.gemini.consumer;

import com.thebestsolar.gemini.id.Hello;

public class HelloConsumer {
    private Hello service;

    public Hello getService() {
        return service;
    }
    public void setService(Hello service) {
        this.service = service;
    }

    public void init() {
        System.out.println("OSGi client started.");
        if (service != null) {
            System.out.println("Calling sayHello()");
            service.sayHello();
        }
    }
}
