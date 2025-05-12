package net.engineeringdigest.journalApp.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SpringSecurity extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        /* http
            .authorizeRequests()
               .antMatchers("/hello").permitAll()
               .anyRequest().authenticated()
            .and()
            .formLogin();

        Explanation:
            1. Permits all requests to "/hello" without authentication.
            2. For any other request, authentication is necessary.
            3. A form based (username and password) login will be used.
        */
    }
}
