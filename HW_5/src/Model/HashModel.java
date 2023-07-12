package Model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import Controller.iGetModel;

public class HashModel implements iGetModel {

    private HashMap<Long, Student> studentsMap;

    public HashModel(HashMap<Long, Student> studentsMap) {
        this.studentsMap = studentsMap;
    }

    /*
     * переопределяем метод getAllStudents, из HashMap возвращаем List<Student>
     */
    @Override
    public List<Student> getAllStudents() {
        List<Student> students = new ArrayList<>();
        for (Long key : studentsMap.keySet()) {
            students.add(studentsMap.get(key));
        }
        return students;
    }

    /*
     * метод принимает значение поля id студента и удаляет этого студента из списка
     */
    public void delStud(Long id) {
        Long temp = new Long(0);
        for (Long k : studentsMap.keySet()) {
            if (studentsMap.get(k).getId() == id) {
                temp = k;
            }
        }
        studentsMap.remove(temp);
    }

    
    
}
