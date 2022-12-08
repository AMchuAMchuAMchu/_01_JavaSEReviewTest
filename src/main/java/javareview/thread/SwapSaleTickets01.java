package javareview.thread;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Description ==> TODO
 * BelongsProject ==> _01_JavaSEReviewTest
 * BelongsPackage ==> javareview.thread
 * Version ==> 1.0
 * CreateTime ==> 2022-12-07 19:27:32
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */
public class SwapSaleTickets01 {


    private static int tickets = 100;

    private static final Object obj = new Object();

    public void salesT() {
        while (true){
        synchronized (obj) {
            obj.notify();
                if (tickets > 0) {
                    try {
                        TimeUnit.MICROSECONDS.sleep(20);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.println(Thread.currentThread().getName() + "::" + tickets--);

                    try {
                        obj.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }else {
                    break;
                }
            }
        }

    }

    public static void main(String[] args) {

        SwapSaleTickets01 sp01 = new SwapSaleTickets01();

        for (int i = 0; i < 2; i++) {
            new Thread(sp01::salesT).start();
        }

    }




}
