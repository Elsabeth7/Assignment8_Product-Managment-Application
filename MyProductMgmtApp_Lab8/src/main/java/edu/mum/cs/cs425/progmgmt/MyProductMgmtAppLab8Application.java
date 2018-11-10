package edu.mum.cs.cs425.progmgmt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@EnableAutoConfiguration
//I change the name
//@ComponentScan("edu.mum.cs.cs425.progmgmt")
public class MyProductMgmtAppLab8Application {

	public static void main(String[] args) {
		SpringApplication.run(MyProductMgmtAppLab8Application.class, args);
	}
}
