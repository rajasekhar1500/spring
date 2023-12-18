package com.example.multi.module.config;

import com.example.multi.module.numbergenerator.Game;
import com.example.multi.module.numbergenerator.NumberGenerator;
import com.example.multi.module.numbergenerator.impl.GameImpl;
import com.example.multi.module.numbergenerator.impl.NumberGeneratorImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.example.multi.module.numbergenerator")
public class AppConfig {
    // == bean methods ==
    @Bean
    public NumberGenerator numberGenerator() {
        return new NumberGeneratorImpl();
    }
    @Bean
    public Game game() {
        return new GameImpl();
    }
}
