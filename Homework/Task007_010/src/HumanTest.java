import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Julia_2 on 26.03.2016.
 */
public class HumanTest {
    ApplicationContext ac = new ClassPathXmlApplicationContext("spring-config.xml");
    @Test
    public void constructorShouldSetAttributes(){
        Human human = new Human("Ivan",100);
        Assert.assertTrue("Ivan".equals(human.getName())&&100==human.getAgility());
    }
    @Test
    public void humanShouldTalk(){
        Human human = (Human) ac.getBean("human");
        String s = "Hello";
        Assert.assertTrue(s.equals(human.talk()));

    }
    @Test
    public void humanShouldWalk(){
        String s = "i walk like human";
        Human human = (Human) ac.getBean("human");
        Assert.assertTrue(s.equals(human.walk()));
    }
    @Test
    public void humanShouldJump(){
        String s = "i jump like human";
        Human human = (Human) ac.getBean("human");
        Assert.assertTrue(s.equals(human.jump()));
    }
    @Test
    public void humanShouldFight(){
        String s = "i fight like human";
        Human human = (Human) ac.getBean("human");
        Assert.assertTrue(s.equals(human.fight()));
    }
    @Test
    public void humanShouldFlyOnEagle(){
        Eagle eagle = (Eagle) ac.getBean("eagle");
        Human human = (Human) ac.getBean("human");
        String s = "i fly on "+eagle.getName();
        Assert.assertTrue(s.equals(human.fly(eagle)));
    }


}
