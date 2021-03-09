package pl.michalregulski.springdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    private static final Logger log = LoggerFactory.getLogger(Config.class);

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext applicationContext) {
        return args -> {
            var todoRepository = applicationContext.getBean(TodoRepository.class);
            todoRepository.save(new Todo(1L, "Master thesis"));
            final Todo todo = todoRepository.findById(1L);
            log.info(todo.toString());
        };
    }

}
