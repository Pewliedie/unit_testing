package calculator.Junit;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;


@RunWith(value = Parameterized.class)
public class CalcPowTest extends JunitBaseClass{

    private Object a;
    private Object b;
    private Object expected;

    public CalcPowTest(Object a, Object b, Object expected) {
        this.a = a;
        this.b = b;
        this.expected = expected;
    }

   @Parameterized.Parameters
   public static Collection<Object[]> data() {
       Object[][] data = new Object[][]{
               {5.0, 3.0, 125.0},
               {2.0, 3.5, 11.313708499},
               {"3.0", "4.0", "81.0"},
               {"0.0", "0.0", "1.0"},
       };
       return Arrays.asList(data);
   }

   @Test
   public void powTest(){
        casterDouble.cast(a,b,expected);
        double result = calculator.pow(casterDouble.getA(),casterDouble.getB());
       Assert.assertEquals(casterDouble.getC(),result,0.0001);
   }
}
