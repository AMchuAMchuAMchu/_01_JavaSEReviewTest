package javareview.thread;

import sun.management.ThreadInfoCompositeData;
import sun.util.resources.cldr.kea.TimeZoneNames_kea;

import java.util.concurrent.TimeUnit;

/**
 * Description ==> TODO
 * BelongsProject ==> _01_JavaSEReviewTest
 * BelongsPackage ==> javareview.thread
 * Version ==> 1.0
 * CreateTime ==> 2022-12-08 14:43:54
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */
public class SwapTickets02 {

    private static int tickets = 100;

    public synchronized void saleT(){
        while (true){
            notify();
            if (tickets>0){
                try {
                    TimeUnit.MILLISECONDS.sleep(20);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "::" + tickets--);

                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }else{
                break;
            }
        }



    }

    public static void main(String[] args) {

        SwapTickets02 sp02 = new SwapTickets02();

        for (int i = 0; i < 2; i++) {
            new Thread(sp02::saleT).start();
        }


    }

}
