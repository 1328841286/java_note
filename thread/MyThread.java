package thread;
/**
 * 创建线程方式一：继承Thread类
 * 1. 创建一个继承Thread类的子类
 * 2. 重写Thread类中的run()方法，将此线程要执行的操作声明在此方法中
 * 3. 创建Thread类的子类对象
 * 4. 通过此对象调用start()方法来启动此线程
 */
public class MyThread extends Thread {
    @Override
    public void run(){
        for (int i = 0; i < 100; i++) {
            System.out.println(getName()+": Hello World!");
        }
    }
}
