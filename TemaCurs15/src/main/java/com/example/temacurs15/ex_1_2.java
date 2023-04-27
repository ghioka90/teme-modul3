package com.example.temacurs15;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.asm.TypeReference;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class ex_1_2 {
    public static void main(String[] args) throws IOException {
        ObjectMapper objMapper = new ObjectMapper();

//        Ex.1
        Course course1 = objMapper.readValue(new File("src/main/resouces/ex1.json"), Course.class);

//      Ex.2
        Course[] courses = objMapper.readValue(new File("ex2.json"), Course[].class);
        for (Course course : courses) {
            System.out.println(course.getCourseName());
            System.out.println(course.getTrainer().getName());
            System.out.println(course.isOnline());
            for (CourseDay courseDay : course.getCourseDays()) {
                System.out.println(courseDay.getDay());
                System.out.println(courseDay.getStartingHour());
            }
        }
    }
}





