package com.intern.crud.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.oauth2.server.resource.authentication.JwtAuthenticationConverter;
import org.springframework.security.oauth2.server.resource.authentication.JwtGrantedAuthoritiesConverter;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
    
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception{

        http
            .authorizeHttpRequests(auth -> auth
                .requestMatchers("/view","/delete").hasRole("admin")
                .requestMatchers("/viewbyid","/update").hasAnyRole("users", "admin")
                .anyRequest().authenticated());
        http
                .csrf(csrf -> csrf.disable())
                .sessionManagement(management -> management
                        .sessionCreationPolicy(SessionCreationPolicy.STATELESS));
        http
            .oauth2Login(login -> login
                .loginPage("/oauth2/authorization/keycloak"))
            .oauth2ResourceServer(oauth -> oauth
                .jwt(jwt -> jwt
                    .jwtAuthenticationConverter(jwtAuthenticationConverter())));

        return http.build();
    }

    @Bean
    public JwtAuthenticationConverter jwtAuthenticationConverter(){
        JwtAuthenticationConverter converter = new JwtAuthenticationConverter();
        JwtGrantedAuthoritiesConverter grantConverter = new JwtGrantedAuthoritiesConverter();
        grantConverter.setAuthorityPrefix("ROLE_"); // Default "SCOPE_"
        grantConverter.setAuthoritiesClaimName("roles"); //Default "scp" / "scope"
        converter.setJwtGrantedAuthoritiesConverter(grantConverter);
        return converter;
    }

}
