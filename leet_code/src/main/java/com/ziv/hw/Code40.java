package com.ziv.hw;

public class Code40 {

    public static void main(String[] args) {
        String str = "1qazxsw23 edcvfr45tgbn hy67uj m,ki89ol.\\\\/;p0-=\\\\][";
        String s1 = str.replaceAll("[A-Z]+|[a-z]+","");
        System.out.println(str.length() - s1.length());
        String s2 = s1.replaceAll(" ","");
        System.out.println(s1.length() - s2.length());
        String s3 = s2.replaceAll("[0-9]+","");
        System.out.println(s2.length() - s3.length() +  "\n" + s3.length());
    }
}
