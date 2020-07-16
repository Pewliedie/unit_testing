package calculator.Junit;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(value = Parameterized.class)
public class CalcSqrtTest extends JunitBaseClass{

    private Object a;
    private Object expected;

    public CalcSqrtTest(Object a, Object expected) {
        this.a = a;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        Object[][] data = new Object[][]{
                {16.0, 4.0},
                {"-36.0", "6.0"},
                {"74.1", "8.608135686662937"},
        };
        return Arrays.asList(data);
    }

    @Test
    public void powTest(){
        casterDouble.cast(a,expected);
        double result = calculator.sqrt(casterDouble.getA());
        Assert.assertEquals("Invalid result of the square root",casterDouble.getC(),result,0.0001);
    }
}
