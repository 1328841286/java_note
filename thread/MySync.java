package thread;

public class MySync {
    MyThread m1 = new MyThread();
    MyThread m2 = new MyThread();

    static final Object object = new Object();

    public static void main(String[] args) {
        MySync ms = new MySync();
        ms.m1.start();
        ms.m2.start();
        synchronized (object) {
            // todo 锁对象。注意要一直是一个对象
        }
    }
}
