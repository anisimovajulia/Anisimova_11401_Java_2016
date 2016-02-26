import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by Julia on 25.02.2016.
 */
public class ComplexMatrix2x2Test {
    @Test
    public void constructorShouldWorkCorrectly() {
        ComplexNumber complexNumber = mock(ComplexNumber.class);
        when(complexNumber.getA()).thenReturn(1.0);
        when(complexNumber.getB()).thenReturn(2.0);
        ComplexMatrix2x2 cm = new ComplexMatrix2x2(complexNumber);
        Assert.assertTrue(cm.getMas(0, 0).getA() == 1.0 && cm.getMas(0, 0).getB() == 2.0);

    }
    @Test
    public void constructorWith4ParamsShouldWorkCorrectly(){
        ComplexNumber cn1 = mock(ComplexNumber.class);
        ComplexNumber cn2 = mock(ComplexNumber.class);
        ComplexNumber cn3 = mock(ComplexNumber.class);
        ComplexNumber cn4 = mock(ComplexNumber.class);
        when(cn1.getA()).thenReturn(1.0);
        when(cn1.getB()).thenReturn(2.0);
        when(cn2.getA()).thenReturn(-1.0);
        when(cn2.getB()).thenReturn(-2.0);
        when(cn3.getA()).thenReturn(-3.0);
        when(cn3.getB()).thenReturn(-4.0);
        when(cn4.getA()).thenReturn(3.0);
        when(cn4.getB()).thenReturn(4.0);
        ComplexMatrix2x2 cm = new ComplexMatrix2x2(cn1,cn2,cn3,cn4);
        Assert.assertTrue(cm.getMas(0,0).getA()==cn1.getA()&&cm.getMas(0,0).getB()==cn1.getB()&&cm.getMas(0,1).getA()==cn2.getA()&&cm.getMas(0,1).getB()==cn2.getB());

    }
    public void methodAddShouldAddComplexMatrixesCorrectly(){
        ComplexNumber cn1 = mock(ComplexNumber.class);
        ComplexNumber cn2 = mock(ComplexNumber.class);
        ComplexNumber cn3 = mock(ComplexNumber.class);
        ComplexNumber cn4 = mock(ComplexNumber.class);
        when(cn1.getA()).thenReturn(1.0);
        when(cn1.getB()).thenReturn(2.0);
        when(cn2.getA()).thenReturn(-1.0);
        when(cn2.getB()).thenReturn(-2.0);
        when(cn3.getA()).thenReturn(-3.0);
        when(cn3.getB()).thenReturn(-4.0);
        when(cn4.getA()).thenReturn(3.0);
        when(cn4.getB()).thenReturn(4.0);
        ComplexMatrix2x2 cm1 = new ComplexMatrix2x2(cn1,cn2,cn3,cn4);
        ComplexMatrix2x2 cm2 = new ComplexMatrix2x2(cn1,cn2,cn4,cn3);
        ComplexMatrix2x2 cm3  = cm1.add(cm2);

        Assert.assertTrue(cm3.getMas(0,0).getA()==2.0&&cm3.getMas(0,0).getB()==4.0&&cm3.getMas(0,1).getA()==-2.0&&cm3.getMas(0,1).getB()==-4.0&&cm3.getMas(1,0).getA()==0.0&&cm3.getMas(1,0).getB()==0.0&&cm3.getMas(1,1).getA()==0.0&&cm3.getMas(1,1).getB()==0.0);
    }
    public void methodMulthouldMultMatrixesCorrectly(){
        ComplexNumber cn1 = mock(ComplexNumber.class);
        ComplexNumber cn2 = mock(ComplexNumber.class);
        ComplexNumber cn3 = mock(ComplexNumber.class);
        ComplexNumber cn4 = mock(ComplexNumber.class);
        when(cn1.getA()).thenReturn(1.0);
        when(cn1.getB()).thenReturn(2.0);
        when(cn2.getA()).thenReturn(-1.0);
        when(cn2.getB()).thenReturn(-2.0);
        when(cn3.getA()).thenReturn(-3.0);
        when(cn3.getB()).thenReturn(-4.0);
        when(cn4.getA()).thenReturn(3.0);
        when(cn4.getB()).thenReturn(4.0);
        ComplexMatrix2x2 cm1 = new ComplexMatrix2x2(cn1,cn2,cn3,cn4);
        ComplexMatrix2x2 cm2 = new ComplexMatrix2x2(cn1,cn2,cn4,cn3);
        ComplexMatrix2x2 cm3 = cm1.mult(cm2);
        Assert.assertTrue(cm3.getMas(0,0).getA()==-2.0&&cm3.getMas(0,0).getB()==-4.0&&cm3.getMas(1,1).getA()==-6.0&&cm3.getMas(1,1).getB()==-8.0);
    }
    public void metodDetShoulReturnCorrectDeterminant(){
        ComplexNumber cn1 = mock(ComplexNumber.class);
        ComplexNumber cn2 = mock(ComplexNumber.class);
        ComplexNumber cn3 = mock(ComplexNumber.class);
        ComplexNumber cn4 = mock(ComplexNumber.class);
        when(cn1.getA()).thenReturn(1.0);
        when(cn1.getB()).thenReturn(2.0);
        when(cn2.getA()).thenReturn(-1.0);
        when(cn2.getB()).thenReturn(-2.0);
        when(cn3.getA()).thenReturn(-3.0);
        when(cn3.getB()).thenReturn(-4.0);
        when(cn4.getA()).thenReturn(3.0);
        when(cn4.getB()).thenReturn(4.0);
        ComplexMatrix2x2 cm1 = new ComplexMatrix2x2(cn1,cn2,cn3,cn4);
        ComplexNumber det = cm1.det();
        Assert.assertTrue(det.getA()==0.0&&det.getB()==0.0);
    }
}
