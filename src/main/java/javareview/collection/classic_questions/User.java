package javareview.collection.classic_questions;

import lombok.Data;

import java.util.Objects;

/**
 * Description ==> TODO
 * BelongsProject ==> _01_JavaSEOptimizeTest
 * BelongsPackage ==> javareview.sese.classic_questions
 * Version ==> 1.0
 * CreateTime ==> 2022-12-05 08:24:44
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */
@Data
public class User implements Comparable{

    public String name;

    public int age;

    public void shiinaILY(Object... objs){
        for (Object obj : objs) {
            System.out.println(obj);
        }
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age && Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Object o) {
        if (o instanceof User){
            User user = (User) o;
            if (this.name.compareTo(user.getName()) == 0){
                return Integer.compare(this.age,user.age);
            }
            return this.name.compareTo(user.getName());
        }else {
            throw new RuntimeException("牙白!!类型不一致!!");
        }
    }


}
