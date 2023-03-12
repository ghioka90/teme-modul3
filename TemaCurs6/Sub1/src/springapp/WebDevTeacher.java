package springapp;

import org.springframework.stereotype.Component;

@Component("devTeacher")
public class WebDevTeacher implements ITeacher {
    private WisdomWordsService wisdomService;

    @Override
    public String getHomeWork() {
        return "Create your server backend context!";
    }

//    @Override
//    public String getWisdom() {
//        return wisdomService.getMessage();
//    }
}