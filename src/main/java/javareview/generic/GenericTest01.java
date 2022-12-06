package javareview.generic;

import org.junit.Test;

import java.util.List;

/**
 * Description ==> TODO
 * BelongsProject ==> _01_JavaSEReviewTest
 * BelongsPackage ==> javareview.generic
 * Version ==> 1.0
 * CreateTime ==> 2022-12-06 10:52:34
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */
public class GenericTest01 {




    @Test
    public void test01(){

        DefineGeneric01<Thread> generic01 = new DefineGeneric01<>();

        String [] anime = {"神田空太","椎名真白","小春老师","仁学长"};

        List<String> strings = generic01.arrayToList(anime);

        strings.forEach(System.out::println);


//        generic01.set();

//        generic01.set();


    }

}
