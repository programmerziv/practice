package com.ziv.hw;

import java.util.Scanner;

public class Code20 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (true) { // 注意 while 处理多个 case
            String pwd = "021Abc9000";

            if (pwd.length() <= 8) {
                System.out.println("NG");
                continue;
            }
            if (pwd.contains(" ") || pwd.contains("\n")) {
                System.out.println("NG");
                continue;
            }
            if (getMatch(pwd)) {
                System.out.println("NG");
                continue;
            }
            if(getString(pwd,0,3)) {
                System.out.println("NG");
                continue;
            }
            System.out.println("OK");
        }
    }

    private static boolean getMatch(String pwd) {
        String numMatch = "[0-9]";
        String lMatch = "[a-z]";
        String uMatch = "[A-Z]";
        String oMatch = "[^a-zA-Z0-9]";
        int count = 0;
        if (pwd.matches(numMatch)) {
            count++;
        }
        if (pwd.matches(lMatch)) {
            count++;
        }
        if (pwd.matches(uMatch)) {
            count++;
        }
        if (pwd.matches(oMatch)) {
            count++;
        }
        if (count < 3 ){
            return true;
        } else{
            return false;
        }
    }

    private static boolean getString(String str, int l, int r) {
        if (r >= str.length()) {
            return false;
        }
        if (str.substring(r).contains(str.substring(l, r))) {
            return true;
        } else {
            return getString(str, l + 1, r + 1);
        }

    }
}
