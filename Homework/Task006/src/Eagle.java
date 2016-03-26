/**
 * Created by Юлия on 12.02.2016.
 */
public class Eagle extends Animal implements flyable {
    String name;
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
    public void fly() {

        System.out.println("I fly by myself");
    }
}
