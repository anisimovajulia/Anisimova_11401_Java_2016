import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by Julia on 25.02.2016.
 */
public class ComplexMatrix2x2Test {
    ApplicationContext ac = new ClassPathXmlApplicationContext(
            "spring-config.xml"
    );
    @Test
    public void constructorShouldWorkCorrectly() {
        ComplexNumber complexNumber = (ComplexNumber) ac.getBean("cn1");
        ComplexMatrix2x2 cm = new ComplexMatrix2x2(complexNumber);
        Assert.assertTrue(cm.getMas(0, 0).getA() == 1.0 && cm.getMas(0, 0).getB() == 2.0);

    }
    @Test
    public void constructorWith4ParamsShouldWorkCorrectly(){
        ComplexNumber cn1 = (ComplexNumber) ac.getBean("cn1");
        ComplexNumber cn2 = (ComplexNumber) ac.getBean("cn2");
        ComplexNumber cn3 =(ComplexNumber) ac.getBean("cn3");
        ComplexNumber cn4 = (ComplexNumber) ac.getBean("cn4");
        ComplexMatrix2x2 cm = new ComplexMatrix2x2(cn1,cn2,cn3,cn4);
        Assert.assertTrue(cm.getMas(0,0).getA()==cn1.getA()&&cm.getMas(0,0).getB()==cn1.getB()&&cm.getMas(0,1).getA()==cn2.getA()&&cm.getMas(0,1).getB()==cn2.getB());

    }
    @Test
    public void methodAddShouldAddComplexMatrixesCorrectly(){
        ComplexNumber cn1 = (ComplexNumber) ac.getBean("cn1");
        ComplexNumber cn2 = (ComplexNumber) ac.getBean("cn2");
        ComplexNumber cn3 =(ComplexNumber) ac.getBean("cn3");
        ComplexNumber cn4 = (ComplexNumber) ac.getBean("cn4");
        ComplexMatrix2x2 cm1 = new ComplexMatrix2x2(cn1,cn2,cn3,cn4);
        ComplexMatrix2x2 cm2 = new ComplexMatrix2x2(cn1,cn2,cn4,cn3);
        ComplexMatrix2x2 cm3  = cm1.add(cm2);
        ComplexNumber cn5 = new ComplexNumber(2.0,4.0);
        ComplexNumber cn6 = new ComplexNumber(-2.0,-4.0);
        ComplexNumber cn7 = new ComplexNumber(0.0,0.0);
        ComplexNumber cn8 = new ComplexNumber(0.0,0.0);
        ComplexMatrix2x2 cm4 = new ComplexMatrix2x2(cn5,cn6,cn7,cn7);
        Assert.assertTrue(cm4.equals(cm3));
    }

    @Test
    public void methodMulthouldMultMatrixesCorrectly(){
        ComplexNumber cn1 = (ComplexNumber) ac.getBean("cn1");
        ComplexNumber cn2 = (ComplexNumber) ac.getBean("cn2");
        ComplexNumber cn3 =(ComplexNumber) ac.getBean("cn3");
        ComplexNumber cn4 = (ComplexNumber) ac.getBean("cn4");
        ComplexMatrix2x2 cm1 = new ComplexMatrix2x2(cn1,cn2,cn3,cn4);
        ComplexMatrix2x2 cm2 = new ComplexMatrix2x2(cn1,cn2,cn4,cn3);
        ComplexMatrix2x2 cm3 = cm1.mult(cm2);
        ComplexNumber cn5 = new ComplexNumber(-8.0,14.0);
        ComplexNumber cn6 = new ComplexNumber(8.0,-14.0);
        ComplexNumber cn7 = new ComplexNumber(-12.0,34.0);
        ComplexNumber cn8 = new ComplexNumber(12.0,-34.0);
        ComplexMatrix2x2 cm4 = new ComplexMatrix2x2(cn5,cn6,cn7,cn8);
        Assert.assertTrue(cm3.equals(cm4));
    }


    @Test
    public void metodDetShoulReturnCorrectDeterminant(){
        ComplexNumber cn1 = (ComplexNumber) ac.getBean("cn1");
        ComplexNumber cn2 = (ComplexNumber) ac.getBean("cn2");
        ComplexNumber cn3 =(ComplexNumber) ac.getBean("cn3");
        ComplexNumber cn4 = (ComplexNumber) ac.getBean("cn4");
        ComplexMatrix2x2 cm1 = new ComplexMatrix2x2(cn1,cn2,cn3,cn4);
        ComplexNumber det = cm1.det();
        Assert.assertTrue(det.getA()==0.0&&det.getB()==0.0);
    }
}
