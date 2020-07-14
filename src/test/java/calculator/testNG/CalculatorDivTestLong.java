package calculator.testNG;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CalculatorDivTestLong extends BaseCalculatorTest {

    @Test(dataProvider = "divLongDataProviderException", expectedExceptions = NumberFormatException.class, groups = "func-test")
    @Parameters({"a", "b", "expected"})
    public void divTestWithLongsException(Object a, Object b, Object expected) {
        casterLong.cast(a, b, expected);
        long result = calculator.div(casterLong.getA(), casterLong.getB());
    }

    @Test(dataProvider = "divLongDataProvider",groups = "func-test")
    @Parameters({"a", "b", "expected"})
    public void divTestWithLongs(Object a, Object b, Object expected) {
        casterLong.cast(a, b, expected);
        long result = calculator.div(casterLong.getA(), casterLong.getB());
        Assert.assertEquals(result, casterLong.getC());
    }

    @DataProvider(name = "divLongDataProviderException")
    public Object[][] divDataProviderException() {
        return new Object[][]{
                {2L, 0L, 0L},
                {"-10", "0", "0"},
                {"0", "0", "0"}
        };
    }

    @DataProvider(name = "divLongDataProvider")
    public Object[][] divDataProvider() {
        return new Object[][]{
                {10L, 2L, 5L},
                {"-10", "-2", "5"},
                {"10", "-2", "-5"},
        };
    }
}
