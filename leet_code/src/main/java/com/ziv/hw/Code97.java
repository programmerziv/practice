package com.ziv.hw;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Code97 {
    //是对的
    // 第二题是 a+b 吗
    //第二题是哪个  堆内存申请？

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String encryptedString = scanner.nextLine();
        Queue<Integer> queue = new LinkedList<Integer>();
        StringBuilder decryptedString = new StringBuilder();

        for (char c : encryptedString.toCharArray()) {
            if (c == '*') {
                while (queue.size() > 2) {
                    int num = queue.poll();
                    decryptedString.append((char) ('a' + num - 1));
                }
                int x = queue.poll();
                int y = queue.poll();
                decryptedString.append((char) ('a' + (x * 10 + y)- 1));
            } else {
                queue.offer(c - '0');
            }
        }

        System.out.println(decryptedString.toString());
    }

//    static char mapToChar(int num) {
//        return ;
//    }

}
