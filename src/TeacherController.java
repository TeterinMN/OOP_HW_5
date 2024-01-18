import java.util.List;

class TeacherController {
    private final TeacherService model;
    private final TeacherView view;

    public TeacherController(TeacherService model, TeacherView view) {
        this.model = model;
        this.view = view;
    }

    public void createTeacher(String name, String subject) {
        Teacher teacher = new Teacher(model.getAllTeachers().size() + 1, name, subject);
        model.addTeacher(teacher);
    }

    public void editTeacher(int index, String name, String subject) {
        if (index >= 0 && index < model.getAllTeachers().size()) {
            Teacher updatedTeacher = new Teacher(model.getAllTeachers().get(index).id(), name, subject);
            model.editTeacher(index, updatedTeacher);
        }
    }

    public void showAllTeachers() {
        List<Teacher> teacherList = model.getAllTeachers();
        view.displayTeacherList(teacherList);
    }
}