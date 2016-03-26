/**
 * Created by Юлия on 12.02.2016.
 */
public class Orc implements Alive, Orcs {
    String name;
    int age;
    int weight;
    String color;
    public Orc(String name,int age,int weight,String color){
        this.age = age;
        this.name = name;
        this.color = color;
        this.weight = weight;
    }

    @Override
    public String walk() {
        System.out.println("I can walk");
        return null;
    }

    @Override
    public String jump() {
        System.out.println("I can jump");
        return null;
    }

    @Override
    public String fight() {
        System.out.println("I fight");
        return null;
    }

    @Override
    public String dieFromSun() {
        System.out.println("Oh no,I'm dying");
        return "Oh no,I'm dying";
    }

    @Override
    public String liveInCave() {
        System.out.println("I live in cave)))");
        return "I live in cave)))";
    }

    @Override
    public String eat(Human human) {
        human.setAlive(false);
        System.out.println("I ate "+human.getName());
        return "I ate "+human.getName();
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }
}
