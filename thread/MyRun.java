package thread;

/**
 * 创建线程方式二：实现Runnable接口
 * 1. 创建一个实现Runnable接口的类
 * 2. 实现run()方法，写上线程需要执行的任务
 * 3. 创建Runnable接口的实现类对象
 * 4. 创建Thread类对象，构造方法中传递Runnable接口的实现类对象
 * 5. 通过Thread类对象调用start()方法启动线程
 * 6. 创建Thread类对象，构造方法中传递Runnable接口的实现类对象
 * 7. 通过Thread类对象调用start()方法启动线程
 */
public  class MyRun implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("线程" + Thread.currentThread().getName() + "运行" + i);
        }
    }
}
