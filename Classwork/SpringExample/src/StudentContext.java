import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Julia_2 on 04.03.2016.
 */
@Configuration
public class StudentContext {
    @Bean
    public Student student(){
        Student student = new Student();
        student.setName("Petuh");
        student.setInstitute(institute());
        student.setLessons(listlessons());
        student.setShedule(shedule());
        return student;
    }
    @Bean
    public Student student1(){
        Student student = new Student();
        student.setName("Filka");
        student.setInstitute(institute());
        student.setLessons(listlessons());
        student.setShedule(shedule());
        return student;
    }
    @Bean
    public Map<Integer,Lesson> shedule() {
        Map<Integer,Lesson> map = new HashMap<>();
        map.put(1,lesson());
        return map;
    }

    @Bean
    public Institute institute(){
        Institute institute = new Institute();
        institute.setName("ENERGO");
        return institute;
    }
    @Bean
    public Lesson lesson(){
        Lesson lesson = new Lesson();
        lesson.setName("Angem");
        return lesson;
    }
    @Bean
    public List<Lesson> listlessons(){
        List list = new ArrayList<>();
        list.add(lesson());
        return list;
    }
}
