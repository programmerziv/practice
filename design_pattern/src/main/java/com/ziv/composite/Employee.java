package com.ziv.composite;

import java.util.ArrayList;
import java.util.List;

public class Employee {

    private String name;

    private String dept;

    private String salary;

    private List<Employee> subEmploys;

    public void add(Employee e){
        subEmploys.add(e);
    }

    public void remove(Employee e){
        subEmploys.remove(e);
    }

    public Employee(String name, String dept, String salary) {
        this.name = name;
        this.dept = dept;
        this.salary = salary;
        this.subEmploys = new ArrayList<Employee>(10);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public List<Employee> getSubEmploys() {
        return subEmploys;
    }

    public void setSubEmploys(List<Employee> subEmploys) {
        this.subEmploys = subEmploys;
    }

    public Employee() {
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", salary='" + salary + '\'' +
                ", subEmploys=" + subEmploys +
                '}';
    }
}
