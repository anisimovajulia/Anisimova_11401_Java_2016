/**
 * Created by Юлия on 12.02.2016.
 */
public class LightElf extends Elf implements Healable {
    public LightElf(String name, int age, Eagle eagle, int agility) {
        super(name, age, eagle, agility);
    }

    @Override
    public void heal(Creature creature) {
        creature.setAgility(creature.agility + 1000);
    }

    @Override
    public void makeMedicine() {
        System.out.println("I make medicine");
    }

    @Override
    public void giveInfiniteLife(Creature creature) {
        creature.setAlive(true);
        System.out.println("You are alive");
    }
}
