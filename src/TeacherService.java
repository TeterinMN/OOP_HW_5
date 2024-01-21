import java.util.ArrayList;
import java.util.List;

/*
Класс реализации управления списком преподавателей.
Класс TeacherService соответствует принципу единственной ответственности, так как он отвечает
только за управление списком преподавателей.
*/
class TeacherService implements TeacherManagement {
    private final List<Teacher> teachers;
    public TeacherService() {
        this.teachers = new ArrayList<>();
    }
    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }
    public void editTeacher(int index, Teacher updatedTeacher) {
        if (index >= 0 && index < teachers.size()) {
            teachers.set(index, updatedTeacher);
        }
    }
    public List<Teacher> getAllTeachers() {
        return teachers;
    }
}