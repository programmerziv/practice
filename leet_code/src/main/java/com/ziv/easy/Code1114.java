package com.ziv.easy;

import java.util.concurrent.atomic.AtomicInteger;

public class Code1114 {


    static class Foo{

        public Foo() {};

        private AtomicInteger fistJobDone = new AtomicInteger();

        private AtomicInteger secondJobDone = new AtomicInteger();

        public void first(Runnable printFirst) throws InterruptedException {
            System.out.println("first Done !");
            fistJobDone.incrementAndGet();
        }

        public void second(Runnable printFirst) throws InterruptedException {
            while (fistJobDone.get() != 1){

            }
            System.out.println("second Done !");
            secondJobDone.incrementAndGet();
        }

        public void third(Runnable printFirst) throws InterruptedException {
            while (secondJobDone.get() != 1){

            }
            System.out.println("third Done !");
            Thread.sleep(1000);
            System.out.println("everything is OK !!!");
        }


    }


    public static void main(String[] args) throws Exception {
        Foo foo = new Foo();

        Runnable run1 = new Runnable() {
            public void run() {
                System.out.println("hello one");
            }
        };
        Runnable run2 = new Runnable() {
            public void run() {
                System.out.println("hello two");
            }
        };
        Runnable run3 = new Runnable() {
            public void run() {
                System.out.println("hello three");
            }
        };
        foo.second(run2);

        foo.first(run1);

        foo.second(run3);



    }

}
