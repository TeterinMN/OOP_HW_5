import java.util.List;

// Интерфейс для управления списком преподавателей
interface TeacherManagement {
    void addTeacher(Teacher teacher);
    void editTeacher(int index, Teacher updatedTeacher);
    List<Teacher> getAllTeachers();
}