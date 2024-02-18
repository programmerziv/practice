package com.ziv.hw;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Code27 {
    public static void main(String[] args) {
        String str = "3 abc bca cab abc 1";
        String[] strArry =  str.split(" ");
        int num = Integer.valueOf(strArry[0]);
        int numS = Integer.valueOf(strArry[strArry.length - 1]);
        String strS = strArry[strArry.length - 2];
        ArrayList<String> strSList = new ArrayList<String>();
        char[] strSArry = strS.toCharArray();
        Arrays.sort(strSArry);
        for (int i =1; i<= num; i++) {
            if (strS.equals(strArry[i])
                    || strS.length() != strArry[i].length()) {
                continue;
            }
            char[] tmpChar = strArry[i].toCharArray();
            Arrays.sort(tmpChar);
            if (new String(strSArry).
                    equals(new String(tmpChar))) {
                strSList.add(strArry[i]);
            }
        }
        int  size = strSList.size();
        System.out.println(size);
        if(numS <= size) {
            Collections.sort(strSList);
            System.out.println(strSList.get(numS - 1));
        }



    }
}
