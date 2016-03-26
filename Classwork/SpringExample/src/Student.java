import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * Created by Julia on 26.02.2016.
 */

public class Student {

    private String name;

    private Institute institute;
    private List<Lesson> lessons;
    private Homework hw;

    private Map<Integer,Lesson> shedule;

    public Map<Integer, Lesson> getShedule() {
        return shedule;
    }

    public void setShedule(Map<Integer, Lesson> shedule) {
        this.shedule = shedule;
    }
    public Student(){

    }
    public Student(String s, Institute institute) {
        this.name= s;
        this.institute=institute;
    }

    public String getName() {
        return name;
    }

    public Institute getInstitute() {
        return institute;
    }

    public List<Lesson> getLessons() {
        return lessons;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setInstitute(Institute institute) {
        this.institute = institute;
    }

    public void setLessons(List<Lesson> lessons) {
        this.lessons = lessons;
    }

    @Override
    public String toString() {
        return this.getName()+" "+this.getInstitute().getName()+" "+this.getLessons().toString();
    }
    public String studentGoesToLessons(){
        String lessons="";
        for (Lesson l: this.getLessons()){
            lessons+=l.getName()+" ";
        }
        return this.getName()+" goes to "+lessons;
    }


}
