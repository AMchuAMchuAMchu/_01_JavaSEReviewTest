package javareview.reflect;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * Description ==> TODO
 * BelongsProject ==> _01_JavaSEReviewTest
 * BelongsPackage ==> javareview.reflect
 * Version ==> 1.0
 * CreateTime ==> 2022-12-08 17:57:41
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */
public class Reflect01 {


    @Test
    public void testReflect01() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        Class<Student> studentClass = Student.class;

        Constructor<Student> constructor = studentClass.getConstructor();

        Student student = constructor.newInstance();

        student.setId(1001);
        student.setName("神田空太");

        System.out.println(">>"+student);


    }


}
