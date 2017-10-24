package com.spring.fizzbuzz.security;

/* This class is responsible for controlling access to the REST call
 * To have this class in effect, it's necessary to turn security to true in application.yml file
 */
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

public class SecurityConfig extends WebSecurityConfigurerAdapter {
	// Authentication : User --> Roles
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication().withUser("user").password("user1").roles("USER").
		and().withUser("admin").password("admin1").roles("USER", "ADMIN");
	}

	// Authorization : Role -> Access
	protected void configure(HttpSecurity http) throws Exception {
		http.httpBasic().and().authorizeRequests().antMatchers("/fizzbuzz/**").hasRole("USER")
		.antMatchers("/**").hasRole("ADMIN").and().csrf().disable().headers().frameOptions().disable();
	}

}
