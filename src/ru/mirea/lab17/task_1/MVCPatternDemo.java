package ru.mirea.lab17.task_1;

public class MVCPatternDemo {
    public static void main(String[] args) {
        Student model = retriveStudentFromDatabase();

        StudentView view = new StudentView();

        StudentController controller = new StudentController(model, view);

        controller.updateView();
    }

    private static Student retriveStudentFromDatabase() {
        Student model = new Student();

        model.setName("Gosha");
        model.setRollNo("programmer");

        return model;
    }
}
