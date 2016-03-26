
import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Julia_2 on 26.03.2016.
 */
public class EagleTest {
    ApplicationContext ac = new ClassPathXmlApplicationContext("spring-config.xml");
    @Test
    public void constructorShouldWorkCorrectly(){
        Eagle eagle = new Eagle("Gwaihir",700);
        Assert.assertTrue(eagle.getName().equals("Gwaihir")&&eagle.getPower()==700);
    }
    @Test
    public void eagleShouldFly(){
        Eagle eagle = (Eagle) ac.getBean("eagle");
        String s = "I fly by myself";
        Assert.assertTrue(s.equals(eagle.fly()));
    }
}
