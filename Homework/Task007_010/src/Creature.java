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
    public String walk() {

        return null;
    }

    @Override
    public String jump() {

        return null;
    }

    @Override
    public String fight() {

        return null;
    }

    public boolean isAlive() {
        return alive;
    }

    public int getAgility() {
        return agility;
    }
}
