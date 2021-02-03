package com.gft.algamoney.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/*import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;*/


@SpringBootApplication
public class AlgamoneyApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(AlgamoneyApiApplication.class, args);
	}
	
	/*
	 * @Bean public MessageSource messageSource() { var messageSource = new
	 * ReloadableResourceBundleMessageSource();
	 * messageSource.setBasename("classpath:messages");
	 * messageSource.setDefaultEncoding("UTF-8"); return messageSource; }
	 * 
	 * @Bean public LocalValidatorFactoryBean validator(MessageSource messageSource)
	 * { var bean = new LocalValidatorFactoryBean();
	 * bean.setValidationMessageSource(messageSource);
	 * 
	 * return bean; }
	 * 
	 * @Bean public LocaleResolver localeResolver() { var localeResolver = new
	 * SessionLocaleResolver();
	 * 
	 * return localeResolver; }
	 */
	
	

}
