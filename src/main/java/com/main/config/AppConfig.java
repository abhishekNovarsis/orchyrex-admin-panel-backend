package com.main.config;

import java.util.Arrays;
import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;

import jakarta.servlet.http.HttpServletRequest;

@Configuration
public class AppConfig {
	
	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		
		http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS).and()
		.authorizeHttpRequests(Authorize -> Authorize.requestMatchers("/api/**").authenticated().anyRequest().permitAll())
		.addFilterBefore(new JwtTokenValidator(), BasicAuthenticationFilter.class)
		.csrf().disable().cors().configurationSource(new CorsConfigurationSource() {
					
					@Override
					public CorsConfiguration getCorsConfiguration(HttpServletRequest request) {
						
						CorsConfiguration cfg = new CorsConfiguration();
						
						cfg.setAllowedOrigins(Arrays.asList(
								
								"http://localhost:3000", //react
								"http://localhost:4000" //angular
								
							)
						);
						//cfg.setAllowedMethods(Arrays.asList("GET", "POST","DELETE","PUT"));
						cfg.setAllowedMethods(Collections.singletonList("*"));	//allowing all methods
						cfg.setAllowCredentials(true);
						cfg.setAllowedHeaders(Collections.singletonList("*"));
						cfg.setExposedHeaders(Arrays.asList("Authorization"));
						cfg.setMaxAge(3600L);
						return cfg;	
					}
				})
		.and()
		.httpBasic()
		.and()
		.formLogin();
		
		return http.build();
		
	}
	
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

}










//import java.util.Arrays;
//import java.util.Collections;
//
//import org.springframework.context.annotation.Bean; 
//import org.springframework.context.annotation.Configuration; 
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.http.SessionCreationPolicy;
//import org.springframework.security.core.userdetails.User; 
//import org.springframework.security.core.userdetails.UserDetails; 
//import org.springframework.security.core.userdetails.UserDetailsService; 
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder; 
//import org.springframework.security.crypto.password.PasswordEncoder; 
//import org.springframework.security.provisioning.InMemoryUserDetailsManager; 
//import org.springframework.security.web.SecurityFilterChain;
//import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;
//import org.springframework.web.cors.CorsConfiguration;
//import org.springframework.web.cors.CorsConfigurationSource;
//
//import jakarta.servlet.http.HttpServletRequest; 
//  
//@Configuration
//public class SecurityConfig { 
//  
//    // Password Encoder 
//    @Bean
//    public PasswordEncoder passwordEncoder() { 
//        return new BCryptPasswordEncoder(); 
//    } 
//      
//    // User configuration 
//    @Bean
//    public UserDetailsService userDetailsService() { 
//        UserDetails normalUser=User 
//                .withUsername("Pranay") 
//                .password(passwordEncoder().encode("password")) 
//                  // roles 
//                .roles("NORMAL")  
//                .build(); 
//        UserDetails adminUser=User 
//                .withUsername("Admin") 
//                .password(passwordEncoder().encode("password")) 
//                .roles("ADMIN") 
//                .build(); 
//        InMemoryUserDetailsManager inMemoryUserDetailsManager= new InMemoryUserDetailsManager(); 
//        inMemoryUserDetailsManager.createUser(normalUser); 
//        inMemoryUserDetailsManager.createUser(adminUser); 
//  
//        return inMemoryUserDetailsManager; 
//    } 
//      
//  
//      
//    @Bean
//    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception{ 
//          
//    	http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS).and()
//		.authorizeHttpRequests(Authorize -> Authorize.requestMatchers("/api/**").authenticated().anyRequest().permitAll())
//		.addFilterBefore(new JwtTokenValidator(), BasicAuthenticationFilter.class)
//		.csrf().disable().cors().configurationSource(new CorsConfigurationSource() {
//					
//					@Override
//					public CorsConfiguration getCorsConfiguration(HttpServletRequest request) {
//						
//						CorsConfiguration cfg = new CorsConfiguration();
//						
//						cfg.setAllowedOrigins(Arrays.asList(
//								
//								"http://localhost:3000" //react
//	
//								
//							)
//						);
//						//cfg.setAllowedMethods(Arrays.asList("GET", "POST","DELETE","PUT"));
//						cfg.setAllowedMethods(Collections.singletonList("*"));	//allowing all methods
//						cfg.setAllowCredentials(true);
//						cfg.setAllowedHeaders(Collections.singletonList("*"));
//						cfg.setExposedHeaders(Arrays.asList("Authorization"));
//						cfg.setMaxAge(3600L);
//						return cfg;	
//					}
//				})
//		.and()
//		.httpBasic()
//		.and()
//		.formLogin();
//		
//		return http.build();
//		
//	}
//      
//      
//}