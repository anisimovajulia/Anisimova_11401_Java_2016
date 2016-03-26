import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Юлия on 12.02.2016.
 */
public class DrowElf extends Elf implements DarkMagic {
    @Autowired
    private Eagle eagle;

    public DrowElf(String name, int age, Eagle eagle, int agility) {
        super(name, age, eagle, agility);
    }

    @Override
    public void hex(Creature creature) {
        creature.setAgility(0);
    }

    @Override
    public void kill(Creature creature) {
        creature.setAlive(false);
        System.out.println("i killed it!");
    }

    @Override
    public Potion makePotion(int i) {
        Potion p = new Potion();
        p.setPower(i);
        System.out.println("I make potion");
        return p;
    }


}
