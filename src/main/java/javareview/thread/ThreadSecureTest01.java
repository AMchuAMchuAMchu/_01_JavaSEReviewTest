package javareview.thread;

import com.sun.org.glassfish.external.statistics.Statistic;

import java.util.concurrent.TimeUnit;

/**
 * Description ==> TODO
 * BelongsProject ==> _01_JavaSEReviewTest
 * BelongsPackage ==> javareview.thread
 * Version ==> 1.0
 * CreateTime ==> 2022-12-07 10:47:08
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */
public class ThreadSecureTest01 {

    public static int tickets = 100;

    public void salesTickets(){
        for (int i = 0; i < 100; i++) {
//            try {
//                TimeUnit.MILLISECONDS.sleep(10);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
            if (tickets>0){
                System.out.println(Thread.currentThread().getName() + "::" + tickets--);
            }
        }
    }

    public static void main(String[] args) {
        ThreadSecureTest01 secureTest01 = new ThreadSecureTest01();
        for (int i = 0; i < 3; i++) {
            new Thread(secureTest01::salesTickets).start();
        }

    }







}
