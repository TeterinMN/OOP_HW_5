import java.util.List;

class TeacherView {
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