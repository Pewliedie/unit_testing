package calculator.testNG;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CalculatorSubTestDouble extends BaseCalculatorTest {
    @Test(dataProvider = "sumDoubleDataProvider", groups = "sub-test")
    @Parameters({"a", "b", "expected"})
    public void subTestWithDoubles(Object a, Object b, Object expected) {
        casterDouble.cast(a, b, expected);
        double result = calculator.sub(casterDouble.getA(), casterDouble.getB());
        Assert.assertEquals(result, casterDouble.getC());
    }

    @DataProvider(name = "sumDoubleDataProvider")
    public Object[][] subDataProvider() {
        return new Object[][]{
                {10.5, 5.5, 5.0},
                {0.0, 0.0, 0.0},
                {"1.5", "2.5", "-1.0"},
                {"2.5", "2.5", "0.0"},
                {"-10.0", "-15.0", "5.0"}
        };
    }
}
