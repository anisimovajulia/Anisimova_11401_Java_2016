import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Julia on 26.02.2016.
 */
public class PotionTest {
    @Test
    public void setterWorksCorrectly(){
        Potion p = new Potion();
        p.setPower(400);
        Assert.assertTrue(400==p.getPower());
    }
}
