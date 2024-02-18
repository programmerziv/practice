package com.ziv.hw;

public class Code6 {

    public static void main(String[] args) {
        long l1 = 19L;
        long l2 = (long)Math.sqrt(l1);
        for (long i=2; i <l2; i++) {
            while (l1 % i == 0) {
                System.out.println(i + " ");
                l1 = l1 /i;
            }
        }
        System.out.println(l1 == 1 ? "": l1 + "  ");


    }
}
