package com.itheima.ui;

import java.util.ArrayList;
import java.util.Random;

public class CodeUtil {

    private CodeUtil() {
    }

    public static String getCode() {
        ArrayList<Character> characters = new ArrayList<>();
        Random r = new Random();
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < 26; i++) {
            characters.add((char) ('A' + i));
            characters.add((char) ('a' + i));
        }
        for (int i = 0; i < 4; i++) {
            int random = r.nextInt(52);
            stringBuilder.append(characters.get(random));
        }
        stringBuilder.append(r.nextInt(10));

        //stringBuilder不方便修改,需要变成数组再修改
        String code = stringBuilder.toString();
        char[] charArray = code.toCharArray();


        int randomIndex = r.nextInt(5);

        char temp = charArray[randomIndex];
        charArray[randomIndex] = charArray[4];
        charArray[4] = temp;

        return new String(charArray);

    }


}
