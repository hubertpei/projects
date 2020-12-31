package com.thebestsolar.helloworld;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

/**
 * https://www.baeldung.com/osgi
 */

public class OSGIHelloWorld implements BundleActivator {
	private static final Logger logger = LogManager.getLogger("OSGIHelloWorld");
	@Override
	public void start(BundleContext context) throws Exception {
		System.out.println("OSGIHelloWorld started");
		logger.info("OSGIHelloWorld started");
		
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		System.out.println("OSGIHelloWorld stoped");
		logger.info("OSGIHelloWorld stoped");
		
	}

}
