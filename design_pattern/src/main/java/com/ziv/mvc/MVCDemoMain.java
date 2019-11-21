package com.ziv.mvc;

public class MVCDemoMain {


    public static void main(String[] args) {
        Student model = retrieveStudentFromDatabase();

        StudentView studentView = new StudentView();

        StudentController studentController = new StudentController(model,studentView);

        studentController.updateView();

        System.out.println("=================================");

        model.setName("阿强");
        model.setRollNo("伍六七");
        studentController.updateView();
    }

    private static Student retrieveStudentFromDatabase(){
        Student student = new Student();
        student.setName("阿珍");
        student.setRollNo("梅花十三");
        return student;
    }
}
