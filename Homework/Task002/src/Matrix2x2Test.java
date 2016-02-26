import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

/**
 * Created by Julia on 24.02.2016.
 */
public class Matrix2x2Test {
    @Test
    public void constructorShouldSaveNullsInMatrix(){
        Matrix2x2 m = new Matrix2x2();
        Assert.assertTrue((0==m.m[0][0])&&0==m.m[0][1]&&0==m.m[1][0]&&0==m.m[1][1]);
    }
    @Test
    public void methodGetMasShouldReturnMassiveElement(){
        Matrix2x2 m1 = new Matrix2x2();
        double m2 = m1.getMas(1,1);
        Assert.assertEquals(m2,m1.m[1][1],1e-9);
    }
    @Test(expected = Exception.class)
    public void getMasShouldThrowException() throws Exception{
        Matrix2x2 m1 = new Matrix2x2();
        double m2 = m1.getMas(2,1);

    }
    @Test
    public void constructorShouldReturnSameValues(){
        double[][] mas = {{1,2},{3,4}};
        Matrix2x2 m1 = new Matrix2x2(mas);
        Assert.assertTrue(m1.m[0][0]==mas[0][0]&&m1.m[0][1]==mas[0][1]&&m1.m[1][0]==mas[1][0]&&m1.m[1][1]==mas[1][1]);
    }
    @Test
    public void methodAddShouldAddValuesOfMatrixes(){
        Matrix2x2 m1 = new Matrix2x2(1,2,3,4);
        Matrix2x2 m2 = new Matrix2x2(1,1,2,2);
        Matrix2x2 m3 = new Matrix2x2(2,3,5,6);
        Matrix2x2 m4 = m1.add(m2);
        Assert.assertTrue(m4.equals(m3));

    }
    @Test
    public void add2ShouldAddMatrixToThis(){
        Matrix2x2 m1 = new Matrix2x2(1,2,3,4);
        Matrix2x2 m2 = new Matrix2x2(1,1,2,2);
        Matrix2x2 m3 = new Matrix2x2(2,3,5,6);
        m2.add2(m1);
        Assert.assertTrue(m2.equals(m3));
    }
    @Test
    public void subShouldReduceThisMatrixCorrect(){
        Matrix2x2 m1 = new Matrix2x2(1,2,3,4);
        Matrix2x2 m2 = new Matrix2x2(1,1,2,2);
        Matrix2x2 m3 = new Matrix2x2(0,1,1,2);
        Matrix2x2 m4 = m1.sub(m2);
        Assert.assertTrue(m4.equals(m3));
    }
    @Test
    public void multNumberShouldMultOnThisNumber(){
        Matrix2x2 m1 = new Matrix2x2(1,2,3,4);
        double i = 2;
        Matrix2x2 m2 = m1.multNumber(i);
        Matrix2x2 m3 = new Matrix2x2(2,4,6,8);
        Assert.assertTrue(m3.equals(m2));
    }
    @Test
    public void multShouldMultMatrixes(){
        Matrix2x2 m1 = new Matrix2x2(1,2,0,1);
        Matrix2x2 m2 = new Matrix2x2(1,2,1,1);
        Matrix2x2 m3 = new Matrix2x2(3,4,1,1);
        Matrix2x2 m4 = m1.mult(m2);
        Assert.assertTrue(m4.equals(m3));
    }
    @Test
    public void detShouldReturnDescriminant(){
        Matrix2x2 m1 = new Matrix2x2(1,2,3,4);
        Assert.assertEquals(-2, m1.det(), 1e-9);
    }
    @Test
    public void trasponShouldWorkCorrectly(){
        Matrix2x2 m1 = new Matrix2x2(1,2,3,4);
        m1.transpon();
        Assert.assertTrue(m1.m[0][1]==3&&m1.m[1][0]==2);
    }
    public void inversehouldWorkCorrectly(){
        Matrix2x2 m1 = new Matrix2x2(1,2,3,4);
        m1.inverse();
        Assert.assertTrue(m1.m[0][0]==-2.0&&m1.m[0][1]==1.5&&m1.m[1][0]==1.0&&m1.m[1][1]==-0.5);
    }
}
