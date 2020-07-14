package calculator.testNG;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CalculatorSubTestLong extends BaseCalculatorTest {

    @Test(dataProvider = "subLongDataProvider",groups = "sub-test")
    @Parameters({"a", "b", "expected"})
    public void subTestWithLongs(Object a, Object b, Object expected) {
        casterLong.cast(a, b, expected);
        long result = calculator.sub(casterLong.getA(),casterLong.getB());
        Assert.assertEquals(result, casterLong.getC());
    }

    @DataProvider(name = "subLongDataProvider")
    public Object[][] subDataProvider() {
        return new Object[][]{
                {10L, 5L, 5L},
                {0L, 0L, 0L},
                {"2", "2", "0"},
                {"-10", "-15", "5"},
                {"10", "15", "-5"}
        };
    }
}
