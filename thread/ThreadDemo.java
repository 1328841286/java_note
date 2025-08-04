package thread;

import thread.MyCall;
import thread.MyRun;
import thread.MyThread;

import java.util.TreeMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class ThreadDemo {

    public static void main(String[] args) {
        new MyThread().start();
        new MyThread().start();

        MyRun r = new MyRun();
        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);
        t1.start();
        t2.start();

        MyCall mc = new MyCall();
        FutureTask<Integer> ft = new FutureTask<Integer>(mc);
        Thread thread = new Thread(ft);
        thread.start();
        try {
            System.out.println(ft.get());
        } catch (InterruptedException ignored) {
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }
    }
}