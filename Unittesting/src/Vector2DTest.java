import junit.framework.Assert;
import org.junit.Test;

import javax.xml.bind.ValidationException;
import java.lang.reflect.Method;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


/**
 * Created by Юлия on 19.02.2016.
 */
public class Vector2DTest {


    @Test
    public void vectorShouldHavemethodLength(){
        try {
            Method m = Vector2D.class.getMethod("length");
        } catch (NoSuchMethodException e) {
            org.junit.Assert.fail(e.getMessage());
        }

    }

    @Test
    public void defaultVectorShouldHaveZeroLength(){
        Vector2D v1 = new Vector2D();
       org.junit.Assert.assertEquals(0, v1.length(), 1e-9);
    }
    @Test
    public void constructorShouldSaveParamsInAttribute(){
        Vector2D v = new Vector2D(3,4);
        org.junit.Assert.assertTrue(3==v.getX() && 4==v.getY());
    }

    @Test
    public void vectorShouldHaveCorrectLength(){
        Vector2D v = new Vector2D(3,4);
        org.junit.Assert.assertEquals(5, v.length(),1e-9);
    }
    /*@Test
    public void vector2DShouldHaveMethodAdd(){
        try {
            Method m = Vector2D.class.getMethod("add");
        } catch (NoSuchMethodException e) {
            org.junit.Assert.fail(e.getMessage());
        }
    }*/
    @Test
    public void addShouldReturnVector2D(){
        Vector2D v1 = new Vector2D(3,4);
        Vector2D v2 = new Vector2D(1,1);
        Vector2D v4 = new Vector2D(4,5);
        Vector2D v3 = v1.add(v2);
        org.junit.Assert.assertTrue(v3.equals(v4));

    }
    @Test
    public void equalsShouldReturnSameVectors(){
        Vector2D v1 = new Vector2D(2,3);
        Vector2D v2 = new Vector2D(2,3);
        org.junit.Assert.assertTrue(v1.equals(v2));

    }
    @Test
    public void equalsShouldReturnFalseSameVectors(){
        Vector2D v1 = new Vector2D(2,3);
        Vector2D v2 = new Vector2D(2,4);
        org.junit.Assert.assertFalse(v1.equals(v2));

    }
    @Test
    public void equalsShouldReturnFalseOnDiffTypes(){
        Vector2D v1 = new Vector2D(2,3);
        org.junit.Assert.assertFalse(v1.equals(2.5));

    }

    @Test(expected = LengthReduceException.class)
    public void methodReduceLengthShouldThrowException() throws LengthReduceException {
        Vector2D v = new Vector2D(1,2);
        v.reduceLengthBy(0);
        /*
        * ез expected
        * try{
        * v.reduceLengthBy(0);
        * Assert.fail()
        * }
        * catch(LengthReduceException e) {}*/

    }
    @Test
    public void addShouldReturnVector2Dm(){
        Vector2D v1 = new Vector2D(3,4);
        Vector2D v2 = mock(Vector2D.class);
        when(v2.getX()).thenReturn(3.0);
        when(v2.getY()).thenReturn(4.0);
        Vector2D v4 = new Vector2D(v1.getX()+v2.getX(),v1.getY()+v2.getY());
        Vector2D v3 = v1.add(v2);
        org.junit.Assert.assertTrue(v3.equals(v4));

    }
}
