/**
 * Created by Юлия on 12.02.2016.
 */
public class Main {
    public static void main(String[] args) {
        Eagle bigEagle = new Eagle("Клювокрыл",1000);
        Eagle smallEagle = new Eagle("Eagle",500);
        Eagle eagle = new Eagle("Gwaihir",700);
        DrowElf drowElf = new DrowElf("Aragorn",5000,bigEagle,2000);
        LightElf lightElf = new LightElf("Valar",5000,smallEagle,1000);
        Human human  = new Human("Tolkin",400);
        Weapon weapon = new Weapon("Sword",100);
        Dwarf dwarf = new Dwarf(500,"Balin",1540,weapon);
        HalfBreed halfBreed = new HalfBreed("Hermione",600);
        Orc orc  = new Orc("Shrek",50,200,"green");
        Potion potion  =new Potion();
        Elf elf = new LightElf("Galadriel",6000,eagle,1500);
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
