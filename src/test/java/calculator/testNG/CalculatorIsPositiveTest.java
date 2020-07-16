package calculator.testNG;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CalculatorIsPositiveTest extends BaseCalculatorTest {
    @Test(dataProvider = "DataProvider",
            dependsOnMethods = "calculator.testNG.CalculatorIsNegativeTest.isNegativeTest", alwaysRun = true)
    @Parameters({"a", "expected"})
    public void isPositiveTest(Object a, Object expected) {
        casterLong.cast(a);

        boolean result = calculator.isPositive(casterLong.getA());
        Assert.assertEquals(result, expected, "The number is negative");
    }

    @DataProvider(name = "DataProvider")
    public Object[][] DataProvider() {
        return new Object[][]{
                {1L, true},
                {0L, false},
                {-1L, false}
        };
    }
}
