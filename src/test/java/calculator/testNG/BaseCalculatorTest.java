package calculator.testNG;

import calculator.CasterDouble;
import calculator.CasterLong;
import com.epam.tat.module4.Calculator;
import org.testng.annotations.BeforeClass;


public class BaseCalculatorTest {

    protected Calculator calculator;
    protected CasterDouble casterDouble;
    protected CasterLong casterLong;

    @BeforeClass(groups = {"sum-test", "sub-test", "func-test"})
    public void setUpCalculator() {
        calculator = new Calculator();
    }

    @BeforeClass(groups = {"sum-test", "sub-test", "func-test"})
    public void setUpCasterDouble() {
        casterDouble = new CasterDouble();
    }

    @BeforeClass(groups = {"sum-test", "sub-test", "func-test"})
    public void setUpCasterLong() {
        casterLong = new CasterLong();
    }


}
