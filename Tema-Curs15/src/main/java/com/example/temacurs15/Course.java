package com.example.temacurs15;

import lombok.Data;

import java.util.ArrayList;
@Data
public class Course {
    public String courseName;
    public Trainer trainer;
    public boolean online;
    public ArrayList<CourseDay> courseDays;
}
