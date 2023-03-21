package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan(value = org.example);
public class StudentConfiguration {
    @Bean
    @Scope("singleton")
    public Student student(){
        return new Student();
    }

    @Bean
    @Scope("prototype")
    public Student studentPrototype() {
        Student student = new Student();
        student.setLastName("GHIOCA");
        student.setFirstName("ALEX");
        student.setGrade(9);

        return student;
    }
}
