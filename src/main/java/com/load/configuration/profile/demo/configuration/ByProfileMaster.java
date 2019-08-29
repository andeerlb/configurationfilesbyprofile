package com.load.configuration.profile.demo.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile(value = "master")
public class ByProfileMaster implements ConfigurationTeste
{
	private String message = "bean teste master";

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
