/**
 * Created by Юлия on 12.02.2016.
 */
public class Creature implements Alive {
    int agility;
    public void setAgility(int i){
        this.agility = i;
    }
    boolean alive;
    public Creature(){

    }
    public void setAlive(boolean b){
        this.alive = b;
    }

    public String talk() {
        return null;
    }

    @Override
    public void walk() {

    }

    @Override
    public void jump() {

    }

    @Override
    public void fight() {

    }
}
