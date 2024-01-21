import java.util.List;

// Реализация представления преподавателей
class TeacherView implements TeacherDisplay {
    public void displayTeacher(Teacher teacher) {
        System.out.println("ID: " + teacher.id() +
                ", Имя: " + teacher.name() +
                ", Предмет: " + teacher.subject());
    }
    public void displayTeacherList(List<Teacher> teacherList) {
        for (Teacher teacher : teacherList) {
            displayTeacher(teacher);
        }
    }
}