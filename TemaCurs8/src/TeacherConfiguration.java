

import org.springframework.context.annotation.*;

@Configuration
@ComponentScan
@Import(ServiceConfig.class)
public class TeacherConfiguration {

    @Bean
    public JavaTeacher javaTeacher() {
        return new JavaTeacher();
    }

    @Bean
    public WisdomWordsService wisdomWordsService() {
        return new WisdomWordsService();
    }

    @Bean
    public MathTeacher mathTeacher() {
        MathTeacher mathTeacher = new MathTeacher();
        mathTeacher.setWisdomWordsService(wisdomWordsService());
        return mathTeacher;
    }

    @Bean
    @Scope(value="prototype")
    public MyBean myBean() {
        return new MyBean();
    }



}
