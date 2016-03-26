/**
 * Created by Julia on 26.02.2016.
 */
public class Institute {
    private String name;

    public Institute(String s) {
        this.name=s;
    }

    public Institute() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Institute{" +
                "name='" + name + '\'' +
                '}';
    }
}
