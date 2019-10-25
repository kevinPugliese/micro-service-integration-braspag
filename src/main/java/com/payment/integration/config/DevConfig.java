package com.payment.integration.config;

import com.payment.integration.services.DBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("dev")
public class DevConfig {

    @Autowired
    private DBService dbService;

    @Bean
    public void instantiateTestDatabase() {
        dbService.instantiateTestDatabase();
    }
}
