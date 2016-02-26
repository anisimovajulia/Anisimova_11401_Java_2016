
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Julia on 26.02.2016.
 */
public class WeaponTest {
    @Test
    public void constructorShouldWorkCorrectly(){
        Weapon w = new Weapon("Knife",50);
        Assert.assertTrue("Knife".equals(w.getName())&&50==w.getWeight());
    }
}
