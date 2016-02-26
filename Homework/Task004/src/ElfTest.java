import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Matchers.endsWith;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by Julia on 26.02.2016.
 */
public class ElfTest {
    @Test
    public void constructorShouldSetAttributes(){
        Eagle eagle = mock(Eagle.class);
        Elf elf = new Elf("Galadriel",6000,eagle,1500);
        Assert.assertTrue("Galadriel".equals(elf.getName())&&6000==elf.getAge()&&eagle.equals(elf.getEagle())&&1500==elf.getAgility());
    }
    @Test
    public void elfShouldFly(){
        Eagle eagle = mock(Eagle.class);
        when(eagle.getName()).thenReturn("Eagle");
        Elf elf = new Elf("Galadriel",6000,eagle,1500);
        String s  = elf.fly();
        Assert.assertTrue("I can fly on my eagle Eagle".equals(s));

    }
    @Test
    public void elfShouldShoot(){
        Eagle eagle = mock(Eagle.class);
        Elf elf = new Elf("Galadriel",6000,eagle,1500);
        String s = elf.shoot();
        Assert.assertTrue("I shoot with bow".equals(s));
    }
    @Test
    public void elfShouldTalkElfLang(){

        Eagle eagle = mock(Eagle.class);
        Elf elf = new Elf("Galadriel",6000,eagle,1500);
        String s = elf.talkElfLang();
        Assert.assertTrue("Aiya!".equals(s));
    }
    @Test
    public void elfShouldDoSomeMagic(){
        Eagle eagle = mock(Eagle.class);
        Elf elf = new Elf("Galadriel",6000,eagle,1500);
        String s = elf.doSomeMagic();
        Assert.assertTrue("I do some magic".equals(s));
    }
    @Test
    public void elfShouldTalk(){
        Eagle eagle = mock(Eagle.class);
        Elf elf = new Elf("Galadriel",6000,eagle,1500);
        String s = elf.talk();
        Assert.assertTrue("Hello".equals(s));
    }
}
