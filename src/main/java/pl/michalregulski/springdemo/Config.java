package pl.michalregulski.springdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    private static final Logger log = LoggerFactory.getLogger(Config.class);

    @Bean
    public CommandLineRunner commandLineRunner() {
        return args -> log.info("Hello world");
    }

}
