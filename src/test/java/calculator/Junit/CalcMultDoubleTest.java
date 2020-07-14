package calculator.Junit;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(value = Parameterized.class)
public class CalcMultDoubleTest extends JunitBaseClass {

    private Object a;
    private Object b;
    private Object expected;

    public CalcMultDoubleTest(Object a, Object b, Object expected) {
        this.a = a;
        this.b = b;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        Object[][] data = new Object[][]{
                {2.5, 2.0, 5.0},
                {2.0, 0.0, 0.0},
                {"2.5", "5.0", "12.5"},
                {"0", "0", "0"},
                {"10", "0.5", "5"},
                {"-10", "0.5", "-5"},
                {"-10", "-5", "50"},
        };
        return Arrays.asList(data);
    }

    @Test
    public void multTest() {
        casterDouble.cast(a, b, expected);
        double result = calculator.mult(casterLong.getA(), casterLong.getB());
        Assert.assertEquals(casterLong.getC(),result,0.0);
    }
}
