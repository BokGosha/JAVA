package ru.mirea.lab17.task_1;

public class StudentController {
    private Student model;
    private StudentView view;

    public StudentController(Student model, StudentView view) {
        this.model = model;
        this.view = view;
    }

    public String getModelName() {
        return model.getName();
    }

    public void setModelName(String name) {
        model.setName(name);
    }

    public String getModelRollNo() {
        return model.getRollNo();
    }

    public void setModelRollNo(String rollNo) {
        model.setRollNo(rollNo);
    }

    public void updateView() {
        view.printStudentDetails(model.getName(), model.getRollNo());
    }
}
