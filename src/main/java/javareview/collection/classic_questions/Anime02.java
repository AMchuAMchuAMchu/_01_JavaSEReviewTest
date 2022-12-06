package javareview.collection.classic_questions;


import java.util.Objects;

/**
 * Description ==> TODO
 * BelongsProject ==> _01_JavaSEOptimizeTest
 * BelongsPackage ==> javareview.sese.classic_questions
 * Version ==> 1.0
 * CreateTime ==> 2022-12-03 21:08:59
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */

public class Anime02 {

    public static final Anime02 ANIME_02 = new Anime02();

    String hello;

//    private Anime02(){
//        this.hello = "扣你吃哇...";
//    }


    public Anime02() {
    }

    public Anime02(String hello) {
        this.hello = hello;
    }

    public String getHello() {
        return hello;
    }

    public void setHello(String hello) {
        this.hello = hello;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Anime02 anime02 = (Anime02) o;
        return Objects.equals(hello, anime02.hello);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hello);
    }
}
