package com.ziv.visit;

import com.ziv.visit.c.Computer;
import com.ziv.visit.c.ComputerPartDisplayVisitor;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.security.SecureRandom;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VisitorDemoMain {

    final static String  pat = "^6.([5-9]|[1-9]\\d+).(\\d+)$";

    final static String  pat1 = "(^6.5.([1-9]\\d+|[0-9]))|(^6.([1-9]\\d|[5-9]).(\\d+))|(([1-9]\\d|[7-9]).([1-9]\\d|\\d).(\\d+))$";



    public static void main(String[] args) {
//        Computer computer = new Computer();
//
//        computer.accept(new ComputerPartDisplayVisitor());


        Pattern compile = Pattern.compile(pat1);
        Matcher matcher = compile.matcher("8.5.11");
        boolean matches = matcher.matches();
        System.out.println(matches);
//        for(int i=0;i<100;i++) {
//            SecureRandom random = new SecureRandom();
//            int num = random.nextInt(7)+1;
//            System.out.println(num);
//        }




    }
}
