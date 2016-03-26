/**
 * Created by Юлия on 12.02.2016.
 */
public class HalfBreed extends Human implements Elves {

    public HalfBreed(String name, int agility) {
        super(name, agility);
    }

    @Override
    public void fly() {
        System.out.println("I can fly");
    }

    @Override
    public void shoot() {
        System.out.println("I shoot with bow");
    }

    @Override
    public String talkElfLang() {

        return "Aiya";
    }

    @Override
    public void doSomeMagic() {
        System.out.println("I'm human but I can do some magic");;
    }
}
