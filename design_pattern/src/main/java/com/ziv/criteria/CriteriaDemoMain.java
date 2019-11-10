package com.ziv.criteria;

import com.ziv.criteria.c.*;
import com.ziv.criteria.i.Criteria;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>title: </p>
 * <p>package: com.ziv.criteria</p>
 * <p>description: </p>
 *
 * @author zhangzong
 * @version 1.0
 * @date 2019/11/5 21:07
 */
public class CriteriaDemoMain {

    public static void main(String[] args) {
        // 筛选人集合
        List<Person> persons = new ArrayList<Person>();

        persons.add(new Person("Robert","Male", "Single"));
        persons.add(new Person("John","Male", "Married"));
        persons.add(new Person("Laura","Female", "Married"));
        persons.add(new Person("Diana","Female", "Single"));
        persons.add(new Person("Mike","Male", "Single"));
        persons.add(new Person("Bobby","Male", "Single"));

        // 筛选条件
        // 男
        Criteria male = new CriteriaMale();
        // 女
        Criteria feMale = new CriteriaFemale();
        // 单身
        Criteria single = new CriteriaSingle();

        // 筛选方式一:单身&&女
        AndCriteria singleAndFemale = new AndCriteria(single,feMale);
        List<Person> singleAndFemales = singleAndFemale.meetCriteria(persons);
        printPerson(singleAndFemales);
        System.out.println("=====================================");
        // 筛选方式二: 单身||男
        OrCriteria SingleOrMale = new OrCriteria(single,male);
        List<Person> SingleOrMales = SingleOrMale.meetCriteria(persons);
        printPerson(SingleOrMales);

    }



    public static void printPerson(List<Person> peoples){
        for (Person person:peoples){
            System.out.println(person.getName()+":"+person.getGender()+":"+person.getMaritalStatus());
        }
    }
}
