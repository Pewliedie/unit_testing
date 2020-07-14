package calculator.testNG;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CalculatorSumTestDouble extends BaseCalculatorTest {
    @Test(dataProvider = "sumDoubleDataProvider", groups = "sum-test")
    @Parameters({"a", "b", "expected"})
    public void sumTestWithDoubles(Object a, Object b, Object expected) {
        casterDouble.cast(a, b, expected);
        double result = calculator.sum(casterDouble.getA(), casterDouble.getB());
        Assert.assertEquals(result, casterDouble.getC());
    }

    @DataProvider(name = "sumDoubleDataProvider")
    public Object[][] sumDataProvider() {
        return new Object[][]{
                {2.5, 2.5, 5.0},
                {0.0, 0.0, 0.0},
                {"1.5", "2.5", "4.0"},
                {"2.5", "2.5", "5.0"},
                {"-15.0", "-10.0", "-25.0"}
        };
    }
}
