package com.joemaster.userservice.cfg;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer;
import org.springframework.security.oauth2.provider.token.TokenStore;

/**
 * Created by pengzq on 2020/07/24.
 */
@Configuration
@EnableResourceServer
@Slf4j
public class ResourceServerConfiguration extends ResourceServerConfigurerAdapter{

    @Override
    public void configure(HttpSecurity http) throws Exception {
        http
                .csrf().disable()
                .authorizeRequests()
                .regexMatchers(".*swagger.*"
                        ,".*v2.*"
                        ,".*webjars.*"
                        ,"/user/login.*"
                        ,"/user/registry.*"
                        ,"/user/test.*"
                        ,"/doc.*"
                        ,"/api.*").permitAll()
                .antMatchers("/**").authenticated();
    }


    @Override
    public void configure(ResourceServerSecurityConfigurer resources) throws Exception {
        log.info("Configuring ResourceServerSecurityConfigurer");
        resources.resourceId("user-service").tokenStore(tokenStore);
    }

    @Autowired
    TokenStore tokenStore;
}
