package com.ziv.hw;

import java.util.*;


public class Code26 {
    public static void main(String[] args) {
        String str = "A Famous Saying: Much Ado About Nothing (2012/8).";
        List<Character> letters = new ArrayList<Character>();
        for(char c :str.toCharArray()) {
            if (Character.isLetter(c)) {
                letters.add(c);
            }
        }

        letters.sort(new Comparator<Character>(){
            public int compare(Character c1, Character c2) {
                return Character.toLowerCase(c1) - Character.toLowerCase(c2);
            }
        });
        StringBuffer sb = new StringBuffer();
        for (int i=0, j=0; i<str.length();i++) {
            if(Character.isLetter(str.charAt(i))) {
                sb.append(letters.get(j));
                j++;
            } else {
                sb.append(str.charAt(i));
            }
        }
        System.out.println(sb.toString());
    }

}
