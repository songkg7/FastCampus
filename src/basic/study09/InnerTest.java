package basic.study09;

class OutClass {
    private int num = 10;
    private static int sNum = 20;
    private InClass inClass;

    public OutClass() {
        inClass = new InClass();
    }

    private class InClass {

        int iNum = 100;

        int sInNum = 500;

        void inTest() {

        }
    }

    public void usingClass() {
        inClass.inTest();
    }

}

public class InnerTest {
    public static void main(String[] args) {
        OutClass outClass = new OutClass();
        outClass.usingClass();
    }

}
