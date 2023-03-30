package org.example;

public class MathTeacher implements ITeacher{

    private WisdomWordsService wisdomService;

    private static final  String MATH_TEACHER_PREFIX = "Math teacher says: ";

    public MathTeacher(WisdomWordsService wisdomService){
        this.wisdomService = wisdomService;
    }

    public MathTeacher(){
    }


    @Override
    public String getHomework() {
        return "Solve 100 calculus problems";
    }

    @Override

    public String getWisdom(){
        return  MATH_TEACHER_PREFIX + wisdomService.getMessage();
    }

    public void setWisdomService(WisdomWordsService wisdomService) {
        this.wisdomService = wisdomService;
    }
}