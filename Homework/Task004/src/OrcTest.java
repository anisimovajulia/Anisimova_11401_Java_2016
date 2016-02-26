import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Julia on 26.02.2016.
 */
public class OrcTest {
    @Test
    public void constructorShouldWorkCorrectly(){
        Orc orc = new Orc("Shrek",500,1000,"black");
        Assert.assertTrue("Shrek".equals(orc.getName())&&500==orc.getAge()&&1000==orc.getWeight()&&"black".equals(orc.getColor()));
    }
    
}
