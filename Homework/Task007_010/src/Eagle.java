/**
 * Created by Юлия on 12.02.2016.
 */
public class Eagle extends Animal implements flyable {
    String name;
    int power;
    public String getName(){
        return this.name;
    }
    public void kill(){
        this.alive = false;
    }
    public Eagle(String name, int power){
        this.name = name;
        this.power = power;
    }
    @Override
    public String fly() {

        System.out.println("I fly by myself");
        return "I fly by myself";
    }

    public int getPower() {
        return power;
    }
}
