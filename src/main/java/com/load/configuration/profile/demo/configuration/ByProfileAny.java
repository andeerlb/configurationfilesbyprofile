package com.load.configuration.profile.demo.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile({"any", "where"})
public class ByProfileAny implements ConfigurationTeste
{
	private String message = "bean teste any";

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
