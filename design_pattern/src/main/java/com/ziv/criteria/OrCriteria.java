package com.ziv.criteria;

import java.util.List;

/**
 * <p>title:或条件 </p>
 * <p>package: com.ziv.criteria</p>
 * <p>description: </p>
 *
 * @author zhangzong
 * @version 1.0
 * @date 2019/11/5 20:49
 */
public class OrCriteria implements Criteria {

    private Criteria criteria;

    private Criteria otherCriteria;


    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> firstCriteria = criteria.meetCriteria(persons);

        List<Person> secondCriteria = otherCriteria.meetCriteria(firstCriteria);

        // 或
        for(Person person:secondCriteria){
            if(!firstCriteria.contains(person)){
                firstCriteria.add(person);
            }
        }

        return firstCriteria;
    }

    
    
    public OrCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }
}
