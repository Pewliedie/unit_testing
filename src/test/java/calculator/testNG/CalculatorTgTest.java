package calculator.testNG;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class CalculatorTgTest extends BaseCalculatorTest {

    @Test(dataProvider = "tgDataProvider", dependsOnMethods = "calculator.testNG.CalculatorIsNegativeTest.isNegativeTest", alwaysRun = true)
    @Parameters({"a", "expected"})
    public void tangentTest(Object a, Object expected) {
        casterDouble.cast(a, expected);
        double result = calculator.tg(casterDouble.getA());
        Assert.assertEquals(result, casterDouble.getC(), 0.000001, "Invalid tangent calculation result");
    }

    @DataProvider(name = "tgDataProvider")
    public Object[][] DataProvider() {
        return new Object[][]{
                {60.0, 0.320040389379563},
                {"4.0", "1.1578212823495777"}
        };
    }
}
