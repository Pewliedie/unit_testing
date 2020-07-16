package calculator.testNG;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CalculatorCtgTest extends BaseCalculatorTest {
    @Test(dataProvider = "DataProvider",groups = "func-test")
    @Parameters({"a", "expected"})
    public void tangentTest(Object a, Object expected) {
        casterDouble.cast(a, expected);
        double result = calculator.ctg(casterDouble.getA());
        Assert.assertEquals(result, casterDouble.getC(), 0.000001,"Invalid cotangent calculation result");
    }

    @DataProvider(name = "DataProvider")
    public Object[][] DataProvider() {
        return new Object[][]{
                {7.0, 1.14751542241},
                {"30.0", "-0.15611995216"}
        };
    }
}
