package com.ziv.criteria.i;

import com.ziv.criteria.c.Person;

import java.util.List;

/**
 * <p>title: Criteria</p>
 * <p>package: com.ziv.criteria</p>
 * <p>description:标准接口 </p>
 *
 * @author zhangzong
 * @version 1.0
 * @date 2019/11/5 20:44
 */
public interface Criteria {

    List<Person> meetCriteria(List<Person> persons);
}
