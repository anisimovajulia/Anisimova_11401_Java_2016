import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Юлия on 12.02.2016.
 */
public class Dwarf extends Creature implements Dvarves{
    String name;
    int goldEnum;
    @Autowired
    Weapon weapon;

    public Dwarf(int agility,String name, int goldEnum, Weapon weapon){
        this.agility = agility;
        this.name = name;
        this.goldEnum = goldEnum;
        this.weapon = weapon;
    }

    @Override
    public String talkDvarfLang() {
        return "Atrast 'Vala";
    }

    @Override
    public Weapon makeWeapon(String name,int weight) {
        Weapon weapon = new Weapon(name,weight);

        return weapon;
    }

    @Override
    public void collectGold(int goldEnum) {
        this.goldEnum+=goldEnum;
        System.out.println("I collect gold");
    }

    @Override
    public void fightWithGun(Weapon weapon) {
        System.out.println("I fight with "+ weapon.name);
    }
}
