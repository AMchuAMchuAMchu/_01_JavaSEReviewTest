package javareview.collection.collection01;

import javareview.collection.classic_questions.User;
import org.junit.Test;

import java.util.*;

/**
 * Description ==> TODO
 * BelongsProject ==> _01_JavaSEOptimizeTest
 * BelongsPackage ==> java.se.collection01
 * Version ==> 1.0
 * CreateTime ==> 2022-12-03 10:40:56
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */
public class List01 {



    @Test
    public void testTreeSet(){


        Comparator com = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if (o1 instanceof User && o2 instanceof User){
                    User u01 = (User) o1;
                    User u02 = (User) o2;

                    return -Integer.compare(u01.getAge(),u02.getAge());
                }else {
                    throw new RuntimeException("牙白!类型不一致!!");
                }
            }
        };

        TreeSet<User> users = new TreeSet<>(com);

        User shino = new User("shino", 16);

        User shiina = new User("shiina", 16);

        User yukino = new User("yukino", 17);

        User shiina02 = new User("shiina", 22);

        users.add(shino);
        users.add(shiina);
        users.add(yukino);
        users.add(shiina02);

        users.forEach(System.out::println);





    }


    @Test
    public void testString03(){
        char value [] ;

        String shiina = "椎名真白";

//        shiina.value;



    }

    @Test
    public void testAddressBasicType01(){
        //证明为什么User重写了HashCode之后hashCode是一样的呢??
        String name01 = "椎名真白";
        String name02 = "椎名真白";
        Integer i01 = 52002;
        Integer i02 = 52002;
//        System.out.println(name01.equals(name02));//true
        System.out.println("name01hashCode01:"+name01.hashCode());
        System.out.println("name01hashCode02:"+Objects.hashCode(name01));
        System.out.println("==");
//        System.out.println("name02hashCode:"+name02.hashCode());
//        System.out.println("i01:"+i01.hashCode());
        int length = name01.length();
        char[] chars = new char[20];
        name01.getChars(0,name01.length(),chars,0);
        System.out.println(Arrays.toString(chars));
//        System.out.println("i02:"+i02.hashCode());
    }


    @Test
    public void testHashCode01(){

        HashSet<Object> objects = new HashSet<>();

        User user01 = new User("真白",16);
        User user02 = new User("真白",16);

        Integer i01 = new Integer(1);
        Integer i02 = new Integer(1);

        objects.add(user01);
        objects.add(user02);
        System.out.println();
        System.out.println();
        System.out.println();
        objects.forEach(System.out::println);
        System.out.println("====");
        //证明重写hashCode方法前后hashCode的值是不是一样的说...
        System.out.println("user01HashCode:"+user01.hashCode());
        System.out.println("user02HashCode:"+user02.hashCode());
//        System.out.println(Objects.hash(user01));
//        System.out.println(Objects.hashCode(user01));
//        System.out.println(user01.equals(user02));
//        System.out.println(i01.equals(i02));
//        user01.shiinaILY(123,"真白", LocalDateTime.now());
//        System.out.println(Objects.hash(user01));
//        System.out.println(Objects.hashCode(user01));
//        System.out.println(Objects.deepEquals(user01, user02));

    }

    @Test
    public void testString(){

        String shiina = "樱%满集@@拔剑-?:椎名真白-+shiina+==}}]]雪乃赤瞳.png";

        boolean b1 = true;

        char b2 = 1;

        int i1 = 'W';

//        1.0
//        String s = shiina.split(":")[1].split("-")[0];
//
//        System.out.println(s);
//        2.0
//        String s = shiina.split("]")[2].split("赤")[0];
//
//        System.out.println(s);
//        3.0
//        String substring = shiina.substring(shiina.lastIndexOf("."));
//
//        System.out.println(substring);


    }

    @Test
    public void testArrayList_calculateCapacity(){

        Object[] objects01 = new Object[0];

        Object[] objects02 = new Object[2];

        System.out.println(objects01.equals(objects02));



    }

    @Test
    public void testIAddAdd(){

        int i = 0;

        ArrayList<String> strings = new ArrayList<>();

        strings.add("楪祈");
        strings.add("椎名真白");
        strings.add("青山七海");

        System.out.println(strings.get(i++));

    }

    @Test
    public void testColl02(){

        Object[] objects = {"纳尼!","所does捏",123};

        System.out.println("原长度:"+objects.length);
        for (Object object : objects) {
            System.out.println(object);
        }

        Object[] objects1 = Arrays.copyOf(objects, 10);

        System.out.println("复制之后的长度:"+objects1.length);
        for (Object o : objects1) {
            System.out.println(o);
        }

    }

    @Test
    public void testColl01() {
        long start = System.currentTimeMillis();
        for (int j = 0; j < 10000; j++) {
//            ArrayList<Object> objects = new ArrayList<>();
            ArrayList<Object> objects = new ArrayList<>(1000);
            for (int i = 0; i < 1000; i++) {
                objects.add("112");
            }
//            System.out.println("size:"+objects.size());
        }
        long end = System.currentTimeMillis();

        System.out.println("耗时:" + (end - start));
    }





}
