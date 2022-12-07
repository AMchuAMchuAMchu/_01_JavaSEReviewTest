package javareview.thread;

import org.junit.Test;

import java.time.LocalDateTime;
import java.util.concurrent.*;

/**
 * Description ==> TODO
 * BelongsProject ==> _01_JavaSEReviewTest
 * BelongsPackage ==> javareview.thread
 * Version ==> 1.0
 * CreateTime ==> 2022-12-07 10:18:18
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */
public class ThreadCreative01 {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
//        T11 t11 = new T11();
//        T11 t12 = new T11();
//        T11 t13 = new T11();
//
//        t11.start();
//        System.out.println(t11.getName());
//        t12.start();
//        System.out.println(t12.getName());
//        t13.start();
//        System.out.println(t13.getName());

//        T12 t12 = new T12();
//        Thread thread = new Thread(t12);
//        thread.start();

//        T13 t13 = new T13();
//
//        FutureTask<Object> futureTask = new FutureTask<Object>(t13);
//
//        Thread thread13 = new Thread(futureTask);
//
//        thread13.start();
//        System.out.println(futureTask.get());

        ExecutorService threadPool = Executors.newFixedThreadPool(3);

        threadPool.submit(()->{
            System.out.println(Thread.currentThread().getName()+"stay cool 尤吉欧01");
        });

        threadPool.submit(()->{
            System.out.println(Thread.currentThread().getName()+"stay cool 尤吉欧02");
        });

        threadPool.submit(()->{
            System.out.println(Thread.currentThread().getName()+"stay cool 尤吉欧03");
        });

        threadPool.shutdown();

    }
}

class T13 implements Callable {
    @Override
    public Object call() throws Exception {
        System.out.println("T13...");
        return LocalDateTime.now();
    }
}

class T12 implements Runnable{

    @Override
    public void run() {
        System.out.println("T12...");
    }
}

class T11 extends Thread{
    @Override
    public void run() {
        System.out.println("T11....");
    }
}




