package com.load.configuration.profile.demo.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile(value = "dev")
public class ByProfileDev implements ConfigurationTeste
{
	private String message = "bean teste dev";

	@Bean(name = "beanTest")
	public ConfigurationTeste config() {
		return this;
	}

	@Override
	public String getMessage()
	{
		return message;
	}
}
