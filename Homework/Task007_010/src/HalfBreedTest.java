import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Julia_2 on 26.03.2016.
 */
public class HalfBreedTest {
    ApplicationContext ac = new ClassPathXmlApplicationContext("spring-config.xml");
    @Test
    public void constructorShouldSetAttributes(){
        HalfBreed halfBreed = new HalfBreed("Hermione",300);
        Assert.assertTrue("Hermione".equals(halfBreed.getName()) && 300 == halfBreed.getAgility());
    }
    @Test
    public void halfBreedShouldTalkElfLang(){
        HalfBreed halfBreed = (HalfBreed) ac.getBean("halfBreed");
        String s = "Aiya";
        Assert.assertTrue(s.equals(halfBreed.talkElfLang()));

    }
    @Test
    public void halfBreedShouldTalk(){
        HalfBreed halfBreed = (HalfBreed) ac.getBean("halfBreed");
        String s = "Hello";
        Assert.assertTrue(s.equals(halfBreed.talk()));

    }
    @Test
    public void halfBreedShouldFly(){
        HalfBreed halfBreed = (HalfBreed) ac.getBean("halfBreed");
        String s = "I can fly";
        Assert.assertTrue(s.equals(halfBreed.fly()));

    }
    @Test
    public  void halfBreedShouldShoot(){
        HalfBreed halfBreed = (HalfBreed) ac.getBean("halfBreed");
        String s = "I shoot with bow";
        Assert.assertTrue(s.equals(halfBreed.shoot()));
    }
    @Test
    public  void halfBreedShouldDoSomeMagic(){
        String s= "I'm human but I can do some magic";
        HalfBreed halfBreed = (HalfBreed) ac.getBean("halfBreed");
        Assert.assertTrue(s.equals(halfBreed.doSomeMagic()));
    }

}
