package org.example;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Setter
@Getter
@Component

public class Student {
    private String lastName;
    private String firstName;
    int grade;

    public Student(String lastName, String firstName, int grade) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.grade = grade;
    }
}
