package CodTeme.TemaCurs3.src;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class animalConfiguration {
    @Bean
    public Dog dog(){
        return new Dog("REX");
    }
    @Bean
    public Cat cat(){
        return new Cat("ZEN");
    }

    @Bean
    public Mouse mouse(){
        return new Mouse("JERRY");
    }

}
