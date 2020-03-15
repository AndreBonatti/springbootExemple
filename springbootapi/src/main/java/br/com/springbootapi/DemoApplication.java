package br.com.springbootapi;


import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class DemoApplication {
	
	private static final Logger LOG = LoggerFactory.getLogger(DemoApplication.class);
	
	@Value("${app.message}") 
	private String appMessage;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@PostConstruct
	public void read() {		
		LOG.error(appMessage);
		//System.out.println(appMessage);		
	}
}
