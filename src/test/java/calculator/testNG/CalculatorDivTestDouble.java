package calculator.testNG;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static java.lang.Double.NaN;

public class CalculatorDivTestDouble extends BaseCalculatorTest{

    @Test(dataProvider = "divLongDataProviderException", expectedExceptions = NumberFormatException.class,groups = "func-test")
    @Parameters({"a", "b", "expected"})
    public void divTestWithLongsException(Object a, Object b, Object expected) {
        casterDouble.cast(a, b, expected);
        double result = calculator.div(casterDouble.getA(),casterDouble.getB());
    }

    @Test(dataProvider = "divLongDataProvider",groups = "func-test")
    @Parameters({"a", "b", "expected"})
    public void divTestWithLongs(Object a, Object b, Object expected) {
        casterDouble.cast(a, b, expected);
        double result = calculator.div(casterDouble.getA(),casterDouble.getB());
        Assert.assertEquals(result,casterDouble.getC(),"Invalid result of division");
    }

    @DataProvider(name = "divLongDataProviderException")
    public Object[][] divDataProviderException() {
        return new Object[][]{
                {2.0, 0.0, 0.0},
                {"-10.0", "0.0", "0.0"},
                {"0.0", "0.0", "0.0"}
        };
    }

    @DataProvider(name = "divLongDataProvider")
    public Object[][] divDataProvider() {
        return new Object[][]{
                {5.0, 2.0, 2.5},
                {5.0, 0.0, Double.POSITIVE_INFINITY},
                {-5.0, 0.0, Double.NEGATIVE_INFINITY},
                {0.0, 0.0, NaN},
                {"-10.0", "-2.0", "5.0"},
                {"10.0", "-2.0", "-5.0"}
        };
    }
}
