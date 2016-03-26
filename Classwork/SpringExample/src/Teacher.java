/**
 * Created by Julia on 26.02.2016.
 */
public class Teacher {
    String name;
    Lesson lesson;
    public Teacher(String name,Lesson lesson){
        this.name=name;
        this.lesson=lesson;
    }
    public static Teacher newTeacher(String name,Lesson lesson){
        return new Teacher(name,lesson);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Lesson getLesson() {
        return lesson;
    }

    public void setLesson(Lesson lesson) {
        this.lesson = lesson;
    }
    public String teacherTeachs(){
        return this.name+" teaches "+this.lesson.getName();
    }
}
