import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Julia on 26.02.2016.
 */
public class CreatureTest {
    @Test
    public void setAliveShouldSetAlive(){
        Creature c = new Creature();
        c.setAlive(false);
        Assert.assertTrue(c.alive==false);
    }
    @Test
    public void setAgilityShouldWorkCorrectly(){
        Creature c = new Creature();
        c.setAgility(200);
        Assert.assertTrue(200==c.getAgility());
    }
}
