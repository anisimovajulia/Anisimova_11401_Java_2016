/**
 * Created by Юлия on 12.02.2016.
 */
public class Orc implements Alive,Orcs {
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
    public void walk() {
        System.out.println("I can walk");
    }

    @Override
    public void jump() {
        System.out.println("I can jump");
    }

    @Override
    public void fight() {
        System.out.println("I fight");
    }

    @Override
    public void dieFromSun() {
        System.out.println("Oh no,I'm dying");
    }

    @Override
    public void liveInCave() {
        System.out.println("I live in cave)))");
    }

    @Override
    public void eat(Human human) {
        human.setAlive(false);
        System.out.println("I ate "+human.getName());
    }
}
