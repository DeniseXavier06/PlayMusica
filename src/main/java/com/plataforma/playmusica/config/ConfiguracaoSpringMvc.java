package com.plataforma.playmusica.config;

import java.util.concurrent.ConcurrentHashMap.KeySetView;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.util.UrlPathHelper;
import org.thymeleaf.spring5.SpringTemplateEngine;
import org.thymeleaf.spring5.templateresolver.SpringResourceTemplateResolver;




import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;


@Configuration
public class ConfiguracaoSpringMvc extends WebMvcConfigurerAdapter {
	
	@Bean
	public SpringTemplateEngine templateEngine(SpringResourceTemplateResolver resolver) {
		SpringTemplateEngine templateEngine = new SpringTemplateEngine();
		templateEngine.setTemplateResolver(resolver);
		return templateEngine;
	}
	
	public void addViewControllers (ViewControllerRegistry registry) {
	    
	        registry.addViewController("/").setViewName("home");
	        registry.addViewController("/home").setViewName("home");
	    }
		
	}
	
	
	

