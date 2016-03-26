/**
 * Created by Юлия on 12.02.2016.
 */
public class Human extends Creature  {
    String name;
     public Human(String name,int agility){
         this.name = name;
         this.agility = agility;
     }
    public String getName(){
        return this.name;
    }

    @Override
    public String talk() {
        return "Hello";
    }

    @Override
    public String walk() {
        System.out.println("i walk like human");
        return "i walk like human";
    }

    @Override
    public String jump() {
        System.out.println("i jump like human");
        return "i jump like human";
    }

    @Override
    public String fight() {
        System.out.println("i fight like human");
        return "i fight like human";
    }


    public String fly(Eagle eagle) {
        System.out.println("i fly on "+eagle.getName());
        return "i fly on "+eagle.getName();
    }
}
