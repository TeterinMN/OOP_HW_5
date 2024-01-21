import java.util.List;

/*
Класс TeacherView соответствует принципу разделения интерфейса. Так как клиенты могут зависеть только от тех
интерфейсов, которые им действительно нужны.
Класс отображения преподавателей реализует оба интерфейса TeacherSingleDisplay и TeacherListDisplay.
 */
class TeacherView implements TeacherSingleDisplay, TeacherListDisplay {
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