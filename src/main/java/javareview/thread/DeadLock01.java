package javareview.thread;

import java.util.concurrent.TimeUnit;

/**
 * Description ==> TODO
 * BelongsProject ==> _01_JavaSEReviewTest
 * BelongsPackage ==> javareview.thread
 * Version ==> 1.0
 * CreateTime ==> 2022-12-07 14:16:12
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */
public class DeadLock01 {


    public static void main(String[] args) {

        Object o01 = new Object();

        Object o02 = new Object();


        Thread t1 = new Thread(() -> {
            synchronized (o01) {
                System.out.println("AA...");
                try {
                    TimeUnit.MILLISECONDS.sleep(20);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (o02) {
                    System.out.println("BB...");
                }
            }
        });

        t1.start();


        Thread t2 = new Thread(() -> {
            synchronized (o02) {
                System.out.println("CC...");
                try {
                    TimeUnit.MILLISECONDS.sleep(20);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (o01) {
                    System.out.println("DD...");
                }
            }

        });

        t2.start();


    }


}
