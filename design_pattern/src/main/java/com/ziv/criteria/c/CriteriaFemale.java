package com.ziv.criteria.c;

import com.ziv.criteria.i.Criteria;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>title: </p>
 * <p>package: com.ziv.criteria</p>
 * <p>description: 女人标准类  作为标准的一部分 </p>
 *
 * @author zhangzong
 * @version 1.0
 * @date 2019/11/5 20:50
 */
public class CriteriaFemale implements Criteria {

    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> femalePersons = new ArrayList<Person>(10);
        for(Person person:persons){
            if(person.getGender().equalsIgnoreCase("female")){
                femalePersons.add(person);
            }
        }
        return femalePersons;
    }
}
