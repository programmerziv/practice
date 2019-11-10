package com.ziv.criteria.c;

/**
 * <p>title:Person </p>
 * <p>package: com.ziv.criteria</p>
 * <p>description:人类 </p>
 *
 * @author zhangzong
 * @version 1.0
 * @date 2019/11/5 20:45
 */
public class Person {

    private String name;

    private String gender;

    private String maritalStatus;

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public Person(String name, String gender, String maritalStatus) {
        this.name = name;
        this.gender = gender;
        this.maritalStatus = maritalStatus;
    }
}
