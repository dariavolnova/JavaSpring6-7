package com.example.demo.configs;

import com.example.demo.model.Music;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@ComponentScan("com.example.demo")
@EnableWebMvc
public class ConfigMusic implements WebMvcConfigurer {
    private final ApplicationContext applicationContext;

    @Autowired
    public ConfigMusic(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }

    @Bean
    public Music firstMusic() {
        return new Music("Supermodel", "RuPaul", "Dance pop", 239);
    }
    @Bean
    public Music secondMusic() {
        return new Music("Le perv", "Carpenter Brut", "Electronic", 200);
    }
    @Bean
    public Music thirdMusic() {
        return new Music("Dayvan Cowboy", "Boards of Canada", "Electronic IDM", 300);
    }
}
