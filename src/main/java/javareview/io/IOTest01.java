package javareview.io;

import org.junit.Test;

import java.io.*;
import java.util.GregorianCalendar;

/**
 * Description ==> TODO
 * BelongsProject ==> _01_JavaSEReviewTest
 * BelongsPackage ==> javareview.io
 * Version ==> 1.0
 * CreateTime ==> 2022-12-06 14:06:29
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */
public class IOTest01 {



    @Test
    public void testFileRead() throws IOException {

        FileReader fr = new FileReader("D:\\seldom\\rd\\JavaReview\\_01_JavaSEReviewTest\\src\\main\\java\\javareview\\io\\anime.txt");
        int len;
        byte[] bytes = new byte[1024];

        while ((len = fr.read())!=-1){
            System.out.print(fr.read());
        }

        fr.close();



    }

    @Test
    public void testDirs() throws IOException {

        String name = "d:/椎名真白";
        String dirName = "";
        String newName = "";
        for (int i = 1; i <= 100; i++) {
            newName += "/椎名真白"+i;
            dirName = name + newName;
            File file = new File(dirName);

            if (!file.exists()){
                file.mkdirs();
                System.out.println(dirName+"创建成功!!");
            }else{
                System.out.println(dirName+"已经存在了喔....");
            }
        }




    }
}
