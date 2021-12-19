/*
 * package com.hospital.config;
 * 
 * 
 * import org.springframework.context.annotation.Bean; import
 * org.springframework.context.annotation.Configuration; import
 * org.springframework.security.config.annotation.authentication.builders.
 * AuthenticationManagerBuilder; import
 * org.springframework.security.config.annotation.web.builders.HttpSecurity;
 * import org.springframework.security.config.annotation.web.configuration.
 * EnableWebSecurity; import
 * org.springframework.security.config.annotation.web.configuration.
 * WebSecurityConfigurerAdapter; import
 * org.springframework.security.core.userdetails.UserDetailsService; import
 * org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
 * 
 * import com.hospital.service.CustomUserDetailsService;
 * 
 * @Configuration
 * 
 * @EnableWebSecurity public class WebSecurityConfig extends
 * WebSecurityConfigurerAdapter {
 * 
 * @Bean public UserDetailsService userDetailsService() {
 * System.out.println("called... userDetailsService"); return new
 * CustomUserDetailsService(); }
 * 
 * @Bean public BCryptPasswordEncoder passwordEncoder() {
 * System.out.println("called... passwordEncoder"); return new
 * BCryptPasswordEncoder(); }
 * 
 * @Override protected void configure(AuthenticationManagerBuilder auth) throws
 * Exception { auth .userDetailsService(userDetailsService())
 * .passwordEncoder(passwordEncoder()); }
 * 
 * @Override protected void configure(HttpSecurity http) throws Exception {
 * http.authorizeRequests() .antMatchers("/test").permitAll()
 * .antMatchers("/**").hasAnyRole("ADMIN","USER"); http.csrf().disable();
 * super.configure(http); } }
 */