/**
 * Created by Julia on 26.02.2016.
 */
public class Lesson {
    private String name;

    public Lesson(String s) {
        this.name=s;
    }

    public Lesson() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Lesson{" +
                "name='" + name + '\'' +
                '}';
    }
}