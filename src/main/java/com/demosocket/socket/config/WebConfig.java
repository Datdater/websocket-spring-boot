package com.demosocket.socket.config;

import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("http://localhost:3000",
                        "https://localhost:3000",
                        "https://localhost:8080",
                        "https://hntdiamond.store",
                        "https://console.hntdiamond.store",
                        "http://localhost:5173",
                        "https://websocket-spring-boot-production.up.railway.app",
                        "http://localhost:5174",
                        "http://localhost:5175")
                .allowedMethods("GET", "POST", "PUT", "DELETE")
                .allowedHeaders("*")
                .allowCredentials(true);
    }

}
