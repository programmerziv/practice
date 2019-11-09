package com.ziv.criteria;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>title: </p>
 * <p>package: com.ziv.criteria</p>
 * <p>description: </p>
 *
 * @author zhangzong
 * @version 1.0
 * @date 2019/11/5 20:50
 */
public class CriteriaFemale implements Criteria {

    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> femalePersons = new ArrayList<Person>(10);
        for(Person person:persons){
            if(person.getGender().equalsIgnoreCase("女")){
                femalePersons.add(person);
            }
        }
        return femalePersons;
    }
}
