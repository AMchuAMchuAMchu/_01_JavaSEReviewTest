package javareview.collection.classic_questions;

import org.junit.Test;

/**
 * Description ==> TODO
 * BelongsProject ==> _01_JavaSEOptimizeTest
 * BelongsPackage ==> javareview.sese.classic_questions
 * Version ==> 1.0
 * CreateTime ==> 2022-12-03 21:07:42
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */
public class ClassicQuestionsTest {







    @Test
    public void testHash01(){

        Anime02 anime01 = new Anime02("hello");

        Anime02 anime02 = new Anime02("kncw");

    }



    @Test
    public void test02Singleton(){

//        Anime.ANIME.testHello();


        Anime02 anime02 =  Anime02.ANIME_02;


        String hello = anime02.hello;

        System.out.println(hello);

    }

}
