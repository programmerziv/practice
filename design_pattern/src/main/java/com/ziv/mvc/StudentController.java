package com.ziv.mvc;

public class StudentController {

    private Student model;

    private StudentView view;

    public StudentController(Student model,StudentView view){
        this.model=model;
        this.view=view;
    }

    public Student getModel() {
        return model;
    }

    public StudentView getView() {
        return view;
    }

    public void setView(StudentView view) {
        this.view = view;
    }

    public void setModel(Student model) {
        this.model = model;
    }

    public void updateView(){
        view.printStudentDetail(model.getName(),model.getRollNo());
    }
}
