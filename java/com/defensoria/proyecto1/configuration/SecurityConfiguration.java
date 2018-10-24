package com.defensoria.proyecto1.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
    @Autowired
    @Qualifier("usuarioSistemaServicio")
    private UserDetailsService userService;
	
	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception{
		auth.userDetailsService(userService).passwordEncoder(new BCryptPasswordEncoder());
		
	}
	@Override
	protected void configure(HttpSecurity http) throws Exception {
	   http.authorizeRequests()
	        .antMatchers("/css/*","/imgs/*","images/*","/js/*","/Administrador/*","../build/*").permitAll()
		   .anyRequest().authenticated()
		   .and()
		   .formLogin().loginPage("/login").loginProcessingUrl("/logincheck")
		   .failureUrl("/login?error")
		   .usernameParameter("username").passwordParameter("password")
		   .defaultSuccessUrl("/loginsuccess",true).permitAll()
		   .and() 
		   .logout()
	           .permitAll()
	           .invalidateHttpSession(true)
	           .logoutUrl("/logout").permitAll()
	          // .logoutSuccessUrl("/login").permitAll()
	           .clearAuthentication(true).and()
	       .exceptionHandling().and()
	       .csrf().disable()
	       .headers().frameOptions().disable()
	       .cacheControl().and();
		   
		    
		 /*  .logout().logoutUrl("/logout").logoutSuccessUrl("/login?logout")
		   .permitAll();
	// http.logout().logoutUrl("/logout");
	   http.authorizeRequests().antMatchers("/loginsuccess").permitAll();
	   http.sessionManagement().invalidSessionUrl("/login");*/
	}
	

}
