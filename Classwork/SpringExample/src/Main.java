import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Julia on 26.02.2016.
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext ac =
                new ClassPathXmlApplicationContext(
                        "spring-config.xml"
                );
        Student student1 = (Student) ac.getBean("Student1");
        Student student2 = (Student) ac.getBean("Student2");
        Teacher teacher = (Teacher) ac.getBean("Teacher1");
        System.out.println(teacher.teacherTeachs());
        System.out.println(student1.studentGoesToLessons());
        System.out.println(student2.studentGoesToLessons());}
}
