package com.ziv.criteria.c;

import com.ziv.criteria.i.Criteria;

import java.util.ArrayList;
import java.util.List;

/**
 * 单身类 作为标准的一部分
 */
public class CriteriaSingle implements Criteria {

    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> singlePersons = new ArrayList<Person>(10);
        for (Person single:persons){
            if(single.getMaritalStatus().equalsIgnoreCase("Single")){
                singlePersons.add(single);
            }
        }
        return singlePersons;
    }
}
