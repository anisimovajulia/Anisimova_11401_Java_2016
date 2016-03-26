import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Julia on 26.02.2016.
 */
public class OrcTest {
    ApplicationContext ac = new ClassPathXmlApplicationContext("spring-config.xml");

    Human human = (Human) ac.getBean("human");
    public void constructorShouldWorkCorrectly(){
        Orc orc = new Orc("Shrek",500,1000,"black");
        Assert.assertTrue("Shrek".equals(orc.getName())&&500==orc.getAge()&&1000==orc.getWeight()&&"black".equals(orc.getColor()));
    }
    @Test
    public void orcShouldEat(){
        Orc orc = (Orc) ac.getBean("orc");
        String s = orc.eat(human);
        Assert.assertTrue(s.equals("I ate "+human.getName()));
    }
    @Test
    public void orcShouldLiveInCave(){
        Orc orc = (Orc) ac.getBean("orc");
        String s = "I live in cave)))";
        Assert.assertTrue(s.equals(orc.liveInCave()));
    }
    @Test
    public void orcShouldDieFromSun(){
        Orc orc = (Orc) ac.getBean("orc");
        String s  = "Oh no,I'm dying";
        Assert.assertTrue(s.equals(orc.dieFromSun()));
    }

}
