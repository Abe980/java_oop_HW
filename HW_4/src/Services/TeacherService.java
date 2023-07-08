package Services;

import java.util.ArrayList;
import java.util.List;

import Domen.PersonComparator;
import Domen.Student;
import Domen.Teacher;

public class TeacherService implements iPersonService<Teacher> {
    private List<Teacher> teachers;

    public TeacherService() {
        this.teachers = new ArrayList<Teacher>();
    }

    @Override
    public List<Teacher> getAll() {
        return teachers;
    }

    @Override
    public void create(String firstName, int age) {
        String acadDegree = "unknown";
        Teacher per = new Teacher(firstName, age, acadDegree);
        teachers.add(per);
    }    

    public void sortByFIOTchLst()
    {
        teachers.sort( new PersonComparator<Teacher>());
    }
}
