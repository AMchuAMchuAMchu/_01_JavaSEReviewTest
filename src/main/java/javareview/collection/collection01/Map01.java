package javareview.collection.collection01;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Properties;

/**
 * Description ==> TODO
 * BelongsProject ==> _01_JavaSEOptimizeTest
 * BelongsPackage ==> javareview.sese.collection01
 * Version ==> 1.0
 * CreateTime ==> 2022-12-05 17:03:15
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */
public class Map01 {




    @Test
    public void testProp() throws IOException {

        Properties prop = new Properties();

        InputStream fis = new FileInputStream("D:\\seldom\\rd\\JavaReview\\_01_JavaSEReviewTest\\src\\main\\resources\\anime.properties");
        prop.load(fis);

        prop.entrySet().forEach(System.out::println);


    }

    @Test
    public void testMap02(){

        HashMap<Integer, Object> animes = new HashMap<>();

        animes.put(1001,"Inori");
        animes.put(1002,"shiina");
        animes.put(1003,"shino");
        animes.put(1004,"Meiko");

        animes.forEach((k,v)->{
            System.out.println("k->"+k+"||v->"+v);
        });



    }



    @Test
    public void testHashtable(){

        Hashtable<String, String> hashtable = new Hashtable<>();

        hashtable.put("1001","楪祈");
        hashtable.put("1002","Inori");

        hashtable.clear();

        System.out.println(hashtable.size());


    }

    @Test
    public void testNAN(){

        float f01 = 0f;
        float f02 = 0.0f;

        float f001 = f01/f01;// 0/0
        float f002 = f02/f02;// 0.0/0.0
        float f003 = f01/f02;// 0/0.0
        float f004 = f02/f01;// 0.0/0

        System.out.println("f001::"+f001);
        System.out.println("f002::"+f002);
        System.out.println("f003::"+f003);
        System.out.println("f004::"+f004);
        System.out.println();
        System.out.println();
        System.out.println("f005::"+1/f01);
        System.out.println("f006::"+1/f02);
        System.out.println("f007::"+-1/f02);

    }


    @Test
    public void testHashMap(){

        String [] animeGirls = {"Inori","Yukino","shino","shiina","Meiko"};

//      才tm发现的话数组是有一个length方法的说.....
        System.out.println(animeGirls.length);



//        long[] longs = new long[10];

//        Arrays.fill(longs,100);
//
//        for (long aLong : longs) {
//            System.out.println(aLong);
//        }





    }

    @Test
    public void testMap01(){

        HashMap<Object, Object> map = new HashMap<>();

        map.put(1001,"Inori");
        map.put(1002,"Yukino");
        map.put(1003,"C.C.");
        map.put(1004,"shiina");

        map.entrySet().forEach(System.out::println);
        System.out.println("===");
//        map.remove(1003);
//        map.put(1003,"asuna");
//        Object o = map.get(1004);
//        System.out.println(o);
//        map.clear();
//        map.replace(1003,"Meiko");
//        System.out.println(map.size());
//        HashMap clone = (HashMap) map.clone();
//        System.out.println(">>"+clone);
//        System.out.println(map.containsKey(1001));
//        System.out.println(map.containsValue("shiina"));
//        System.out.println("keySet:"+map.keySet());
//        System.out.println("values:"+map.values());




        map.entrySet().forEach(System.out::println);


//        Hashtable<Object, Object> hashtable = new Hashtable<>();
//
//        hashtable.put(null,null);

    }


}
