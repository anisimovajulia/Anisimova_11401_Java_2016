/**
 * Created by Юлия on 12.02.2016.
 */
public class Elf implements Alive, Elves {
    String name;
    int age;
    Eagle eagle;
    int agility;


    public Elf(String name,int age,Eagle eagle,int agility){
        this.name = name;
        this.age=age;
        this.eagle = eagle;
        this.agility = agility;
    }
    @Override
    public void fly() {
        System.out.println("I can fly on my eagle"+ this.eagle.getName());
    }

    @Override
    public void shoot() {
        System.out.println("I shoot with bow");
    }

    @Override
    public String talkElfLang() {
        return "Aiya!";
    }

    @Override
    public void doSomeMagic() {
        System.out.println("I do some magic");
    }


    public String talk() {
        return "Hello";
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
        System.out.println("I can fight");
    }
}
