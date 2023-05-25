package com.scallion.simple.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * @author Scallion
 * @version 1.0
 * @description: TODO
 * @date 2023/5/23 15:16
 */
@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    //security
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/").permitAll()
                .antMatchers("/hello").hasRole("vip")
                .antMatchers("/function1").hasRole("f1")
                .antMatchers("/function2").hasRole("f2")
        ;
        http.formLogin();
        //http.formLogin().loginPage("/toLogin").usernameParameter("username").passwordParameter("password").loginProcessingUrl("/login");
        //http.logout();
        http.logout().logoutSuccessUrl("/");
        http.rememberMe();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception{
        auth.inMemoryAuthentication().passwordEncoder(new BCryptPasswordEncoder())
                .withUser("user").password(new BCryptPasswordEncoder().encode("1234")).roles("vip")
                .and()
                .withUser("root").password(new BCryptPasswordEncoder().encode("1234")).roles("f1","f2","f3")
                .and()
                .withUser("f2").password(new BCryptPasswordEncoder().encode("1234")).roles("f2");
    }
}
