package com.example.message.config;

import org.springframework.context.annotation.Configuration;
/*
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
*/

//@Configuration
//@EnableWebSecurity
class SpringSecurityConfigurations //extends WebSecurityConfigurerAdapter
{
/*    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests ()
                .antMatchers("/resources/**", "/login", "/doLogin","/register","/doRegister","/forgetPassword","/doForgetPassword").permitAll()
                .antMatchers("/admin/**").hasRole("ADMIN")
                .antMatchers("/user/**").hasRole("USER")
                .anyRequest ()
                .authenticated ()
                .and ()
                .formLogin ();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.jdbcAuthentication ().dataSource ()
    }*/
}
