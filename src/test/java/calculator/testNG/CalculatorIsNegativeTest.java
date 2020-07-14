package calculator.testNG;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CalculatorIsNegativeTest extends BaseCalculatorTest{
    @Test(dataProvider = "DataProvider")
    @Parameters({"a", "expected"})
    public void sumTestWithLongs(Object a, Object expected) {
        casterLong.cast(a);

        boolean result = calculator.isPositive(casterLong.getA());
        Assert.assertEquals(result, expected);
    }

    @DataProvider(name = "DataProvider")
    public Object[][] DataProvider() {
        return new Object[][]{
                {1L, false},
                {0L, false},
                {-1L, true}
        };
    }
}
