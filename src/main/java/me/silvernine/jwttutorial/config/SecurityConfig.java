package me.silvernine.jwttutorial.config;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    public void configure(WebSecurity web) {
        web
                .ignoring()
                .antMatchers("/h2-console/**", "/favicon.ico");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests() //httpServletRequest를 사용하는 요청들에 대한 접근제한을 설정하겠다!
                .antMatchers("/api/hello").permitAll() // 해당 요청에 대해서는 인증없이 통과 가능하다!
                .anyRequest().authenticated(); // 나머지 요청에 대해서는 인증이 필요하다!
    }
}
