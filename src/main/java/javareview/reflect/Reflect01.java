package javareview.reflect;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
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
    public void testField(){

        Class<Student> studentClass = Student.class;

        Field[] fields = studentClass.getFields();

        for (Field field : fields) {
            System.out.println(field);
        }


    }

    @Test
    public void testReflect01() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, ClassNotFoundException {

//        1.0
//        Class<Student> studentClass = Student.class;
//
//        Constructor<Student> constructor = studentClass.getConstructor();
//
//        Student student = constructor.newInstance();
//
//        student.setId(1001);
//        student.setName("神田空太");
//
//        System.out.println(">>"+student);

//        2.0
//        Student student = new Student();
//
//        Class<? extends Student> aClass = student.getClass();
//
//        Constructor<? extends Student> constructor = aClass.getConstructor();
//
//        Student student1 = constructor.newInstance();
//
//        student1.setId(1002);
//        student1.setName("樱满集");
//
//        System.out.println(student1);

//        3.0
//        Class<?> aClass = Class.forName("javareview.reflect.Student");
//
//        Constructor<?> constructor = aClass.getConstructor();
//
//        Student student = (Student) constructor.newInstance();
//
//        student.setId(1003);
//        student.setName("比企谷八潘");
//        System.out.println(student);

//        4.0
//        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
//
//        Class<?> aClass = systemClassLoader.loadClass("javareview.reflect.Student");
//
//        Constructor<?> constructor = aClass.getConstructor();
//
//        Student o = (Student) constructor.newInstance();
//
//        o.setId(1004);
//        o.setName("宿海仁太");
//
//        System.out.println(o);





    }


}
