package lab_2_14.test_generics_1;

/**
 * Created by olegpoberezhets on 3/19/17.
 */
public class MyTuple <A,B,C> {
    A a;
    B b;
    C c;

    public A getA() {
        return a;
    }

    public void setA(A a) {
        this.a = a;
    }

    public B getB() {
        return b;
    }

    public void setB(B b) {
        this.b = b;
    }

    public C getC() {
        return c;
    }

    public void setC(C c) {
        this.c = c;
    }

    public MyTuple(A a, B b, C c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
}

