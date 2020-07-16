package calculator.Junit;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;


@RunWith(value = Parameterized.class)
public class CalcCosTest extends JunitBaseClass{
    private Object a;
    private Object expected;

    public CalcCosTest(Object a, Object expected) {
        this.a = a;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        Object[][] data = new Object[][]{
                {30.0, 0.15425144988},
                {"-40.0", "-0.66693806165"},
                {"60.0", "-0.95241298041"},
        };
        return Arrays.asList(data);
    }

    @Test
    public void powTest(){
        casterDouble.cast(a,expected);
        double result = calculator.cos(casterDouble.getA());
        Assert.assertEquals("Invalid cosine calculation result",casterDouble.getC(),result,0.0001);
    }
}
