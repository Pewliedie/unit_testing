package calculator;

public class CasterDouble {

    private double a;
    private double b;
    private double c;

    public CasterDouble() {
    }

    public CasterDouble(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public void cast(Object a, Object b, Object c) {
        if (a instanceof String) {
            setA(Double.parseDouble((String) a));
            setB(Double.parseDouble((String) b));
            setC(Double.parseDouble((String) c));
        } else {
            setA((Double) a);
            setB((Double) b);
            setC((Double) c);
        }
    }
    public void cast(Object a, Object c) {
        if (a instanceof String) {
            setA(Double.parseDouble((String) a));
            setC(Double.parseDouble((String) c));
        } else {
            setA((Double) a);
            setC((Double) c);
        }
    }
}
