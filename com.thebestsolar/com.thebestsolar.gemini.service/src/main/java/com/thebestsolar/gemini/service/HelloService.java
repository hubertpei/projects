package com.thebestsolar.gemini.service;

import com.thebestsolar.gemini.id.Hello;

public class HelloService implements Hello{
	@Override
	public String getMessage() {
		return "message from HelloService";
	}
	@Override
    public void sayHello(){
        System.out.println( "Hello World!" );
    }
}
