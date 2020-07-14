package calculator;

public class CasterLong {
    private long a;
    private long b;
    private long c;

    public CasterLong() {
    }

    public CasterLong(long a, long b, long c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public long getA() {
        return a;
    }

    public void setA(long a) {
        this.a = a;
    }

    public long getB() {
        return b;
    }

    public void setB(long b) {
        this.b = b;
    }

    public long getC() {
        return c;
    }

    public void setC(long c) {
        this.c = c;
    }

    public void cast(Object a, Object b, Object c) {
        if (a instanceof String) {
            setA(Long.parseLong((String) a));
            setB(Long.parseLong((String) b));
            setC(Long.parseLong((String) c));
        } else {
            setA((Long) a);
            setB((Long) b);
            setC((Long) c);
        }
    }

    public void cast(Object a) {
        if (a instanceof String) {
            setA(Long.parseLong((String) a));
        } else {
            setA((Long) a);
        }
    }
}
