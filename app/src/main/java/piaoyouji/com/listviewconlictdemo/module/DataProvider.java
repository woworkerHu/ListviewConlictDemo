package piaoyouji.com.listviewconlictdemo.module;

import java.util.Random;

/**
 * Created by K4170 on 2018-04-11.
 */

public class DataProvider {
    public static String[] getStrings(int size) {
        if (size <= 0) {
            return null;
        } else {
            String[] strings = new String[size];
            for (int i = 0; i < size; i++) {
                strings[i] = "这是第" + i + "条数据";
            }
            return strings;
        }
    }

    public static int[] getInts(int size){
        if (size <= 0) {
            return null;
        } else {
            int[] ints = new int[size];
            Random random = new Random();
            for (int i = 0; i < size; i++) {
                ints[i] = random.nextInt(255);
            }
            return ints;
        }
    }
}
