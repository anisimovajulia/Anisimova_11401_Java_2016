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
    public void walk() {
        System.out.println("i walk like human");
    }

    @Override
    public void jump() {
        System.out.println("i jump like human");
    }

    @Override
    public void fight() {
        System.out.println("i fight like human");
    }


    public void fly(Eagle eagle) {
        System.out.println("i fly on "+eagle.getName());
    }
}
