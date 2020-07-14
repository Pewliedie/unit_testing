package calculator.Junit;

import calculator.CasterDouble;
import calculator.CasterLong;
import com.epam.tat.module4.Calculator;
import org.junit.BeforeClass;

public class JunitBaseClass {

    protected static Calculator calculator;
    protected static CasterLong casterLong;
    protected static CasterDouble casterDouble;

    @BeforeClass
    public static void setUpCalc(){
        calculator = new Calculator();
    }

    @BeforeClass
    public static void setUpLongCaster(){
        casterLong = new CasterLong();
    }

    @BeforeClass
    public static void setUpDoubleCaster(){
        casterDouble = new CasterDouble();
    }
}
