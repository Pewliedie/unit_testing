package calculator.testNG;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CalculatorIsNegativeTest extends BaseCalculatorTest{
    @Test(dataProvider = "DataProvider")
    @Parameters({"a", "expected"})
    public void isNegativeTest(Object a, Object expected) {
        casterLong.cast(a);

        boolean result = calculator.isNegative(casterLong.getA());
        Assert.assertEquals(result, expected,"The number is positive");
    }

    @DataProvider(name = "DataProvider")
    public Object[][] DataProvider() {
        return new Object[][]{
                {1L, false},
                {0L, false},
                {-1L, true},
                {null, false}
        };
    }
}
