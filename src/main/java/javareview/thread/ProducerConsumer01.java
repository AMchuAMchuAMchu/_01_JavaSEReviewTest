package javareview.thread;

import java.util.concurrent.TimeUnit;

/**
 * Description ==> TODO
 * BelongsProject ==> _01_JavaSEReviewTest
 * BelongsPackage ==> javareview.thread
 * Version ==> 1.0
 * CreateTime ==> 2022-12-08 16:37:02
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */

class Clerk{

    public static int productNum = 0;


    public synchronized void produceProduct() {

        if (productNum < 20){
            productNum++;
            System.out.println(Thread.currentThread().getName() + ":正在生产第" + productNum + "个产品");
            notify();
        }else {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


    }

    public synchronized void consumeProduct() {

        if (productNum > 0){
            System.out.println(Thread.currentThread().getName()+":正在消费第"+productNum+"个商品");
            productNum--;
            notify();
        }else {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
class Producer extends Thread{

    private Clerk clerk;

    public Producer(Clerk clerk) {
        this.clerk = clerk;
    }

    @Override
    public void run() {

        System.out.println(getName() + ":开始生产产品...");

        while (true){
            try {
                TimeUnit.MILLISECONDS.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            clerk.produceProduct();
        }

    }
}
class Consumer extends Thread{

    private Clerk clerk;

    public Consumer(Clerk clerk) {
        this.clerk = clerk;
    }

    @Override
    public void run() {

        System.out.println(getName() + ":开始消费产品...");

        while (true){
            try {
                TimeUnit.MILLISECONDS.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            clerk.consumeProduct();
        }

    }
}


public class ProducerConsumer01 {


    public static void main(String[] args) {

        Clerk clerk = new Clerk();

        Producer producer = new Producer(clerk);

        Consumer consumer = new Consumer(clerk);
//        Consumer consumer02 = new Consumer(clerk);

        producer.start();

        consumer.start();
//        consumer02.start();

    }




}
