import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Julia_2 on 23.03.2016.
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext();
        ac.register(AppConfig.class);
        ac.refresh();
        Eagle bigEagle = (Eagle) ac.getBean("bigEagle");
        Eagle smallEagle = (Eagle) ac.getBean("smallEagle");
        Eagle eagle = (Eagle) ac.getBean("eagle");
        DrowElf drowElf = (DrowElf) ac.getBean("drowElf");
        LightElf lightElf = (LightElf) ac.getBean("lightElf");
        Human human  = (Human) ac.getBean("human");
        Weapon weapon = (Weapon) ac.getBean("weapon");
        Dwarf dwarf = (Dwarf) ac.getBean("dwarf");
        HalfBreed halfBreed = (HalfBreed) ac.getBean("halfBreed");
        Orc orc  = (Orc) ac.getBean("orc");
        Potion potion  = (Potion) ac.getBean("potion");
        Elf elf = (Elf) ac.getBean("elf");
        bigEagle.fly();
        drowElf.fly();
        drowElf.hex(human);
        drowElf.makePotion(500);
        drowElf.doSomeMagic();
        drowElf.fight();
        drowElf.kill(human);
        lightElf.doSomeMagic();
        lightElf.giveInfiniteLife(human);
        lightElf.makeMedicine();
        lightElf.fly();
        System.out.println(lightElf.talkElfLang());
        human.fly(smallEagle);
        human.jump();
        human.walk();
        System.out.println(human.talk());
        dwarf.collectGold(2000);
        dwarf.fightWithGun(weapon);
        dwarf.makeWeapon("Crossbow",20);
        System.out.println(dwarf.talkDvarfLang());
        halfBreed.fly();
        halfBreed.talkElfLang();
        orc.liveInCave();
        orc.eat(halfBreed);
        orc.eat(human);
        orc.dieFromSun();
    }
}
