package javareview.generic;

import sun.management.Agent;

import java.util.ArrayList;
import java.util.List;

/**
 * Description ==> TODO
 * BelongsProject ==> _01_JavaSEReviewTest
 * BelongsPackage ==> javareview.generic
 * Version ==> 1.0
 * CreateTime ==> 2022-12-06 10:48:59
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */
public class DefineGeneric01<T> {

    private String name;

    private Integer time;

    private T animeT;

    public DefineGeneric01(){

    }

    public DefineGeneric01(String name,Integer time,T animeT){
        this.name = name;
        this.time = time;
        this.animeT = animeT;
    }

    public void set(T animeT){
        this.animeT = animeT;
    }

    public T getAnimeT(){
        return animeT;
    }


    public <E> List<E> arrayToList(E [] array){
        ArrayList<E> es = new ArrayList<>();
        for (E e : array) {
            es.add(e);
        }
        return es;
    }





}
