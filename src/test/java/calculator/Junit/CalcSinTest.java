package calculator.Junit;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(value = Parameterized.class)
public class CalcSinTest extends JunitBaseClass{
    private Object a;
    private Object expected;

    public CalcSinTest(Object a, Object expected) {
        this.a = a;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        Object[][] data = new Object[][]{
                {30.0, -0.98803162409},
                {"-40.0", "-0.74511316047"},
                {"60.0", "-0.3048106211"},
        };
        return Arrays.asList(data);
    }

    @Test
    public void powTest() {
        casterDouble.cast(a, expected);
        double result = calculator.sin(casterDouble.getA());
        Assert.assertEquals(casterDouble.getC(), result, 0.0001);
    }
}
