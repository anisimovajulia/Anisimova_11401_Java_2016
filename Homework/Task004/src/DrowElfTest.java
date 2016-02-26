import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by Julia on 26.02.2016.
 */
public class DrowElfTest {
    @Test
    public void elfShouldHex(){
        Eagle bigEagle = mock(Eagle.class);
        DrowElf drowElf = new DrowElf("Aragorn",5000,bigEagle,2000);
        Creature dvarf = new Creature();
        drowElf.hex(dvarf);
        Assert.assertTrue(dvarf.getAgility()==0);
    }
    @Test
    public void elfShouldKill(){
        Eagle bigEagle = mock(Eagle.class);
        DrowElf drowElf = new DrowElf("Aragorn",5000,bigEagle,2000);
        Creature dvarf = new Creature();
        drowElf.kill(dvarf);
        Assert.assertTrue(dvarf.alive==false);
    }
    @Test
    public void elfShouldMakePotion(){
        Eagle bigEagle = mock(Eagle.class);
        DrowElf drowElf = new DrowElf("Aragorn",5000,bigEagle,2000);
        Potion p = drowElf.makePotion(10000);
        Assert.assertTrue(p.getPower()==10000);
    }
}
