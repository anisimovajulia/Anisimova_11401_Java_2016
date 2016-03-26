import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Julia_2 on 26.03.2016.
 */
public class LightElfTest {
    ApplicationContext ac = new ClassPathXmlApplicationContext("spring-config.xml");
    Eagle smallEagle = (Eagle) ac.getBean("smallEagle");
    @Test
    public void constructorShouldSetAttributes(){
        LightElf elf = (LightElf) ac.getBean("lightElf");
        Assert.assertTrue("Valar".equals(elf.getName()) && 500 == elf.getAge() && smallEagle.equals(elf.getEagle()) && 1000 == elf.getAgility());
    }
    @Test
    public void elfShouldFly(){
        LightElf elf = (LightElf) ac.getBean("lightElf");
        String s  = "I can fly on my eagle Eagle";
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
        LightElf elf = (LightElf) ac.getBean("lightElf");
        String s = elf.talkElfLang();
        Assert.assertTrue("Aiya!".equals(s));
    }
    @Test
    public void elfShouldDoSomeMagic(){
        LightElf elf = (LightElf) ac.getBean("lightElf");
        String s = elf.doSomeMagic();
        Assert.assertTrue("I do some magic".equals(s));
    }
    @Test
    public void elfShouldTalk(){
        LightElf elf = (LightElf) ac.getBean("lightElf");
        String s = elf.talk();
        Assert.assertTrue("Hello".equals(s));
    }
    @Test
    public  void lightElfShouldMakeMedicine(){
        LightElf elf = (LightElf) ac.getBean("lightElf");
        String s = "I make medicine";
        Assert.assertTrue(s.equals(elf.makeMedicine()));
    }
    @Test
    public void lightElfShouldGiveInfiniteLife(){
        LightElf elf = (LightElf) ac.getBean("lightElf");
        Creature creature = new Creature();
        elf.giveInfiniteLife(creature);
        Assert.assertTrue(creature.alive);
    }
}
