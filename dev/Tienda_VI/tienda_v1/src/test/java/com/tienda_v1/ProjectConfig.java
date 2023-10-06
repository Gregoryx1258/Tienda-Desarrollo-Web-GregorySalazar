
package com.tienda_v1;

import java.util.Locale;
import org.springframework.boot.autoconfigure.web.WebProperties.LocaleResolver;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.servlet.LocaleContextResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;


@Configuration
public class ProjectConfig implements WebMvcConfigurer{
    /* Los siguientes metodos son para incorporar el tema de internalizacion del proyecto    */
    
    
    /*localeresolver se utilizar para crrear sesion de cambio de idioma*/
    
    @Bean
    public LocaleResolver localeResolver(){
        var slr = new SessionLocaleResolver();
        slr.setDefaultLocale(Locale.getDefault());
        slr.setTimeZoneAttributeName("session.current.timezone");
        return slr;
    }
    
    
    @Bean
    public LocaleChangeInterceptor localeChangeInterceptor(){
        var lci= new LocaleChangeInterceptor();
        lci.setParamName("lang");
        retunr lci;
    }
    
    @Override
    publiv
    
}
