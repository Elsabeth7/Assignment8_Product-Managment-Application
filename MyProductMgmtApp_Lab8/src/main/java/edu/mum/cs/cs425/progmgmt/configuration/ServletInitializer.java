package edu.mum.cs.cs425.progmgmt.configuration;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import edu.mum.cs.cs425.progmgmt.MyProductMgmtAppLab8Application;


public class ServletInitializer extends SpringBootServletInitializer {
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(MyProductMgmtAppLab8Application.class);
	}

}
