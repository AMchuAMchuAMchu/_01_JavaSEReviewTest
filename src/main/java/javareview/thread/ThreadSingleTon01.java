package javareview.thread;

/**
 * Description ==> TODO
 * BelongsProject ==> _01_JavaSEReviewTest
 * BelongsPackage ==> javareview.thread
 * Version ==> 1.0
 * CreateTime ==> 2022-12-07 14:11:26
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */
public class ThreadSingleTon01 {

    public static Object obj = new Object();

    private ThreadSingleTon01() {

    }

    public static Object getObj() {

        if (obj == null) {
            synchronized (Object.class) {
                if (obj == null) {
                    obj = new Object();
                }
            }
        }
        return obj;

    }


}
