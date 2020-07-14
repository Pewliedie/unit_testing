package calculator.Junit;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(value = Parameterized.class)
public class CalcMultLongTest extends JunitBaseClass {

    private Object a;
    private Object b;
    private Object expected;

    public CalcMultLongTest(Object a, Object b, Object expected) {
        this.a = a;
        this.b = b;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        Object[][] data = new Object[][]{
                {2L, 2L, 4L},
                {2L, 0L, 0L},
                {"2", "5", "10"},
                {"0", "0", "0"},
                {"-5", "-5", "25"},
                {"-5", "5", "-25"},
        };
        return Arrays.asList(data);
    }

    @Test
    public void multTest() {
        casterLong.cast(a, b, expected);
        long result = calculator.mult(casterLong.getA(), casterLong.getB());
        Assert.assertEquals(casterLong.getC(), result);
    }
}
