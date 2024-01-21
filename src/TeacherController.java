import java.util.List;

// Контроллер преподавателей
class TeacherController {
    private final TeacherManagement model;
    private final TeacherDisplay view;

    public TeacherController(TeacherManagement model, TeacherDisplay view) {
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