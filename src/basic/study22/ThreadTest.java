package basic.study22;

class MyThread implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 201; i++) {
            System.out.print(i + "\t");
        }
    }

}

public class ThreadTest {

    public static void main(String[] args) {

        System.out.println(Thread.currentThread() + "start");

        MyThread runnable = new MyThread();

        Thread th1 = new Thread(runnable);
        Thread th2 = new Thread(runnable);

        th1.start();
        th2.start();
        System.out.println(Thread.currentThread() + "end");

        Runnable run = new Runnable() {
            @Override
            public void run() {
                System.out.println("run");
            }
        };

        run.run();

    }

}
