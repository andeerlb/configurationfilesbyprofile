package com.load.configuration.profile.demo;

import com.load.configuration.profile.demo.configuration.ConfigurationTeste;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication public class DemoApplication
{
	public static void main(String[] args)
	{
		final ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);
		ConfigurationTeste teste = (ConfigurationTeste) context.getBean("beanTest");
		System.out.println(teste.getMessage());
	}

}
