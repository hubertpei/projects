package com.thebestsolar.osgi.web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HelloWorld extends HttpServlet {
	private static final Logger logger = LoggerFactory.getLogger(HelloWorld.class);
	private static final long serialVersionUID = -8727030276526521384L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
		throws ServletException, IOException {
		PrintWriter writer = response.getWriter();
		logger.info("Hello OSGI web application");
		writer.append("Hello OSGI web application!");
	}
}
