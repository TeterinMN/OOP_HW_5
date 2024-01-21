import java.util.List;

// Сервис преподавателей
interface TeacherManagement {
    void addTeacher(Teacher teacher);
    void editTeacher(int index, Teacher updatedTeacher);
    List<Teacher> getAllTeachers();
}