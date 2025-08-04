package thread;

import java.util.concurrent.Callable;

/**
 * 1. 实现Callable接口
 * 2. 创建Callable接口实现类的对象
 * 3. 将此Callable接口实现类的对象作为参数传递到FutureTask构造器中
 * 4. 将FutureTask对象作为参数传递到Thread构造器中，创建Thread对象，并调用start()方法启动线程
 * 5. 创建FutureTask对象，将FutureTask对象作为参数传递到Thread构造器中，创建Thread对象，并调用start()方法启动线程
 * 6. 通过FutureTask对象调用get()方法获取Callable接口实现类对象返回的结果
 * 7. 启动线程，并获取结果
 */
public class MyCall implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        int sum = 0;
        for (int i = 0; i < 100; i++) {
            sum += i;
        }
        return sum;
    }

}
