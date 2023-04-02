package org.example;

import lombok.Getter;
import lombok.Setter;


public class JavaTeacher implements ITeacher{

    private WisdomWordsService wisdomService;
    @Getter
    @Setter
    private int age;
    @Getter
    @Setter
    private String workPlace;

    public JavaTeacher(WisdomWordsService wisdomService){
        this.wisdomService = wisdomService;

    }

    @Override
    public String getHomework() {
        return "Create 100 classes";
    }

    @Override
    public  String getWisdom(){
        return wisdomService.getMessage();
    }


}