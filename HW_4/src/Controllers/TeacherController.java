package Controllers;

import Domen.Teacher;
import Services.TeacherService;

public class TeacherController implements iPersonController<Teacher> {

    private final TeacherService teacherService = new TeacherService();

    //Метод регистрации учителя в базе данных
    @Override
    public void create(String firstName, int age) {
        teacherService.create(firstName,age);
        teacherService.sortByFIOTchLst();
    }
    
}
