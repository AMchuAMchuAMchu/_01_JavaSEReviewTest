package javareview.thread;

import org.junit.Test;

/**
 * Description ==> TODO
 * BelongsProject ==> _01_JavaSEReviewTest
 * BelongsPackage ==> javareview.thread
 * Version ==> 1.0
 * CreateTime ==> 2022-12-07 10:18:18
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */
public class ThreadCreative01 {

    public static void main(String[] args) {
        T11 t11 = new T11();

        t11.start();

    }
}

class T11 extends Thread{
    @Override
    public void run() {
        System.out.println("T11....");
    }
}




