package com.ziv.iterator;

import com.ziv.iterator.c.NameRepository;
import com.ziv.iterator.i.Iterator;

import java.util.HashMap;
import java.util.Map;

public class IteratorDemoMain {

    public static void main(String[] args) {
        NameRepository nameRepository = new NameRepository();

        for (Iterator iter = nameRepository.getIterator(); iter.hasNext();){
            String name = (String) iter.next();
            System.out.println("Name : " + name);
        }


        Map<String,Object> map = new HashMap<String,Object>(16);




    }
}
