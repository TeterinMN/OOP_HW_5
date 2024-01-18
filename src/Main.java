public class Main {
    public static void main(String[] args) {
        // Создаём объекты MVC
        TeacherService model = new TeacherService();
        TeacherView view = new TeacherView();
        TeacherController controller = new TeacherController(model, view);

        // Добавляем преподавателей
        controller.createTeacher("Михаил Тетерин", "Музыка");
        controller.createTeacher("Анна Иванова", "Физика");

        // Отображаем список преподавателей
        controller.showAllTeachers();

        // Редактируем преподавателя
        System.out.println();
        System.out.println("Редактируем преподавателя, выводим обновлённый список: ");
        controller.editTeacher(0, "Сергей Приходько", "Информатика");

        // Отображаем обновлённый список преподавателей
        controller.showAllTeachers();
    }
}