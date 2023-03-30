package org.example;

public class HistoryTeacher implements ITeacher{
    private WisdomWordsService wordsService;


    public HistoryTeacher(WisdomWordsService wordsService){
        this.wordsService = wordsService;
    }

    @Override
    public String getHomework() {
        return "Learn about WW1";
    }

    @Override
    public String getWisdom(){
        return wordsService.getMessage();
    }

}