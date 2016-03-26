import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.mockito.Mockito.mock;


/**
 * Created by Julia on 26.02.2016.
 */
public class DrowElfTest {
    ApplicationContext ac = new ClassPathXmlApplicationContext("spring-config.xml");
    Eagle bigEagle = (Eagle) ac.getBean("bigEagle");

    public void constructorShouldSetAttributes(){
        DrowElf drowElf = new DrowElf("Aragorn",5000,bigEagle,2000);
        Assert.assertTrue("Aragorn".equals(drowElf.getName()) && 5000 == drowElf.getAge() && bigEagle.equals(drowElf.getEagle()) && 2000 == drowElf.getAgility());
    }
    @Test
    public void elfShouldHex(){
        DrowElf drowElf = (DrowElf) ac.getBean("drowElf");
        Creature dvarf = new Creature();
        drowElf.hex(dvarf);
        Assert.assertTrue(dvarf.getAgility()==0);
    }
    @Test
    public void elfShouldKill(){
        DrowElf drowElf = (DrowElf) ac.getBean("drowElf");
        Creature dvarf = new Creature();
        drowElf.kill(dvarf);
        Assert.assertTrue(dvarf.alive==false);
    }
    @Test
    public void elfShouldMakePotion(){
        DrowElf drowElf = (DrowElf) ac.getBean("drowElf");
        Potion p = drowElf.makePotion(10000);
        Assert.assertTrue(p.getPower()==10000);
    }
}
