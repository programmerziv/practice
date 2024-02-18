package com.ziv.hw;

public class Code31 {
    public static void main(String[] args) {
        String str = "I am  a    student";

        char[] ch =  str.toCharArray();
        StringBuffer sb = new StringBuffer();
        for (int i=0; i< ch.length;i++) {
            if(Character.isLetter(ch[i])) {
                sb.append(ch[i]);
            } else {
                sb.append(" ");
            }
        }
        String[] arr = sb.toString().split(" ");
        for (int i=arr.length-1 ;i>=0; i--) {
            if(!arr[i].equals("")) {
                System.out.print(arr[i] + " ");
            }
        }

    }
}
