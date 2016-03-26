import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by Julia on 26.02.2016.
 */
public class ElfTest {
    ApplicationContext ac = new ClassPathXmlApplicationContext("spring-config.xml");
    Eagle eagle = (Eagle) ac.getBean("eagle");
    @Test
    public void constructorShouldSetAttributes(){
        Elf elf = (Elf) ac.getBean("elf");
        Assert.assertTrue("Galadriel".equals(elf.getName())&&6000==elf.getAge()&&eagle.equals(elf.getEagle())&&1500==elf.getAgility());
    }
    @Test
    public void elfShouldFly(){
        Elf elf = (Elf) ac.getBean("elf");
        String s  = "I can fly on my eagle Gwaihir";
        Assert.assertTrue(elf.fly().equals(s));

    }
    @Test
    public void elfShouldShoot(){
        Elf elf = (Elf) ac.getBean("elf");
        String s = elf.shoot();
        Assert.assertTrue("I shoot with bow".equals(s));
    }
    @Test
    public void elfShouldTalkElfLang(){
        Elf elf = (Elf) ac.getBean("elf");
        String s = elf.talkElfLang();
        Assert.assertTrue("Aiya!".equals(s));
    }
    @Test
    public void elfShouldDoSomeMagic(){
        Elf elf = (Elf) ac.getBean("elf");
        String s = elf.doSomeMagic();
        Assert.assertTrue("I do some magic".equals(s));
    }
    @Test
    public void elfShouldTalk(){
        Elf elf = (Elf) ac.getBean("elf");
        String s = elf.talk();
        Assert.assertTrue("Hello".equals(s));
    }
}
