package br.com.airamcruz.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

@Component
@RefreshScope
@ConfigurationProperties(value = "greeting-service")
public class GreetingConfiguration {
	
	private String greeting;
	private String defaultValue;
	
	
	public GreetingConfiguration() {
	}

	public GreetingConfiguration(String greeting, String defaultValue) {
		this.greeting = greeting;
		this.defaultValue = defaultValue;
	}


	public String getGreeting() {
		return greeting;
	}


	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}


	public String getDefaultValue() {
		return defaultValue;
	}


	public void setDefaultValue(String defaultValue) {
		this.defaultValue = defaultValue;
	}
	
}
