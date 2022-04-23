package com.restaurante;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
                .withUser("admin")
                .password("{noop}123")
                .roles("ADMIN", "MESERO", "USER")
                .and()
                .withUser("mesero")
                .password("{noop}123")
                .roles("MESERO", "USER")
                .and()
                .withUser("user")
                .password("{noop}123")
                .roles("USER");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/platillo/nuevo", "/platillo/guardar",
                        "/platillo/modificar/**", "/platillo/eliminar/**",
                        "/categoria/nuevo", "/categoria/guardar",
                        "/categoria/modificar/**", "/categoria/eliminar/**",
                        "/mesero/nuevo", "/mesero/guardar",
                        "/mesero/modificar/**", "/mesero/eliminar/**",
                        "/usuario/nuevo", "/usuario/guardar",
                        "/usuario/modificar/**", "/usuario/eliminar/**")
                .hasRole("ADMIN")
                .antMatchers("/platillo/listado", "/categoria/listado", "/mesero/listado")
                .hasAnyRole("ADMIN", "MESERO")
                .antMatchers("/")
                .hasAnyRole("USER", "MESERO", "ADMIN")
                .and()
                .formLogin()
                .loginPage("/login")
                .and().
                exceptionHandling().accessDeniedPage("/errores/403");
    }

}
