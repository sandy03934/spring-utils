package com.sandy03934.config;

import com.sandy03934.custom.UserPreferenceThemeResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.ui.context.support.ResourceBundleThemeSource;
import org.springframework.web.servlet.ThemeResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.theme.ThemeChangeInterceptor;

@Configuration
@ComponentScan(basePackages="com.sandy03934")
@EnableWebMvc
public class ThemeEnabledMvcConfiguration implements WebMvcConfigurer {

	@Autowired
	ThemeChangeInterceptor themeChangeInterceptor;
	
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/themes/**").addResourceLocations("classpath:/themes/");
	}

	@Bean
	public ResourceBundleThemeSource resourceBundleThemeSource() {
		return new ResourceBundleThemeSource();
	}

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(themeChangeInterceptor);
	}

    @Bean
    public ThemeResolver themeResolver() {
//        CookieThemeResolver themeResolver = new CookieThemeResolver();
		UserPreferenceThemeResolver themeResolver = new UserPreferenceThemeResolver();
        themeResolver.setDefaultThemeName("w3-theme-indigo");
        return themeResolver;
    }

    @Bean
    public ThemeChangeInterceptor themeChangeInterceptor() {
        ThemeChangeInterceptor interceptor = new ThemeChangeInterceptor();
        interceptor.setParamName("theme");
        return interceptor;
    }
}
