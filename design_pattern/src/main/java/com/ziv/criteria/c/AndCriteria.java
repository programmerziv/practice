package com.ziv.criteria.c;

import com.ziv.criteria.i.Criteria;

import java.util.List;

/**
 * <p>title:和条件 </p>
 * <p>package: com.ziv.criteria</p>
 * <p>description: </p>
 *
 * @author zhangzong
 * @version 1.0
 * @date 2019/11/5 20:47
 */
public class AndCriteria implements Criteria {

    // 条件类作为参数  执行meetCriteria方法，筛选
    private Criteria criteria;

    private Criteria otherCriteria;

    public List<Person> meetCriteria(List<Person> persons) {

        List<Person> firstCriteria = criteria.meetCriteria(persons);

        List<Person> secondCriteria = otherCriteria.meetCriteria(firstCriteria);
        // 与
        return secondCriteria;
    }

    public AndCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }
}
