package com.example.gae;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;

@SpringBootApplication
public class MaterialsApplication implements WebMvcConfigurer {

    private final LocaleChangeInterceptor localeChangeInterceptor;

    public MaterialsApplication(final LocaleChangeInterceptor localeChangeInterceptorIn) {
		this.localeChangeInterceptor = localeChangeInterceptorIn;
	}

	@Override
	public final void addInterceptors(final InterceptorRegistry interceptorRegistry) {
		interceptorRegistry.addInterceptor(localeChangeInterceptor);
	}

	public static void main(final String[] args) {
		SpringApplication.run(MaterialsApplication.class, args);
	}
}
