package com.saber.example_api.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @author saber
 * @version 1.0
 * @create_time 2018/3/1 下午7:33
 */
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter{

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception{
        super.configure(auth);
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception{
        super.configure(http);
    }

    @Override
    public void configure(WebSecurity web) throws Exception{
        super.configure(web);
    }
}
