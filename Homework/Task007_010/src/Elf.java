import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Юлия on 12.02.2016.
 */
public class Elf implements Alive, Elves {
    String name;
    int age;
    @Autowired
    Eagle eagle;
    int agility;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Eagle getEagle() {
        return eagle;
    }

    public int getAgility() {
        return agility;
    }

    public Elf(String name,int age, Eagle eagle,int agility){
        this.name = name;
        this.age=age;
        this.eagle = eagle;
        this.agility = agility;
    }
    @Override
    public String fly() {
        System.out.println("I can fly on my eagle "+ this.eagle.getName());
        return "I can fly on my eagle "+ this.eagle.getName();
    }

    @Override
    public String shoot() {
        System.out.println("I shoot with bow");
        return "I shoot with bow";
    }

    @Override
    public String talkElfLang() {
        return "Aiya!";
    }

    @Override
    public String doSomeMagic() {
        System.out.println("I do some magic");
        return "I do some magic";
    }


    public String talk() {
        return "Hello";
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
        System.out.println("I can fight");
        return null;
    }
}
