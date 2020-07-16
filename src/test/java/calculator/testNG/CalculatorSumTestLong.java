package calculator.testNG;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CalculatorSumTestLong extends BaseCalculatorTest {
    @Test(dataProvider = "sumLongDataProvider",groups = "sum-test")
    @Parameters({"a", "b", "expected"})
    public void sumTestWithLongs(Object a, Object b, Object expected) {
        casterLong.cast(a, b, expected);

        long result = calculator.sum(casterLong.getA(), casterLong.getB());
        Assert.assertEquals(result, casterLong.getC(),"Invalid result of addition");
    }

    @DataProvider(name = "sumLongDataProvider")
    public Object[][] sumDataProvider() {
        return new Object[][]{
                {1L, 1L, 2L},
                {0L, 0L, 0L},
                {"2", "2", "4"},
                {"-10", "-15", "-25"},
        };
    }
}
