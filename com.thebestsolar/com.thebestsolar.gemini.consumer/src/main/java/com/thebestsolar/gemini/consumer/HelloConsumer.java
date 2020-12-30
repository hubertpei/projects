package com.thebestsolar.gemini.consumer;

import java.io.FileWriter;
import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.thebestsolar.gemini.id.Hello;

public class HelloConsumer {
	private static final Logger logger = LoggerFactory.getLogger(HelloConsumer.class);
    private Hello service;

    public Hello getService() {
    	logger.info("get service");
        return service;
    }
    public void setService(Hello service) {
    	logger.info("service is set");
        this.service = service;
    }

    public void init() {
    	try {
			FileWriter writer = new FileWriter("/tmp/MyFile.txt", true);
			writer.write("OSGi client started\n");
			writer.write(service.getMessage());
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	logger.info("OSGi client started");
        System.out.println("OSGi client started.");
        if (service != null) {
        	logger.info("Calling sayHello()");
            System.out.println("Calling sayHello()");
            service.sayHello();
        }
    }
}
