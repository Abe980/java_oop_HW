import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import Controller.Controller;
import Controller.iGetModel;
import Controller.iGetView;
import Model.HashModel;
import Model.ModelFile;
import Model.ModelList;
import Model.Student;
import View.View;
import View.ViewEng;

public class App {
    public static void main(String[] args) throws Exception {
       // System.out.println("Hello, World!");

       // создаем список студентов
       List<Student> students = new ArrayList<Student>();

       // создаем нескольких студентов
       Student s1 = new Student("Сергей",  21, 101);
       Student s2 = new Student("Андрей",  22, 111);
       Student s3 = new Student("Иван", 22, 121);
       Student s4 = new Student("Игорь", 23, 301);
       Student s5 = new Student("Даша",  25, 171);
       Student s6 = new Student("Лена",  23, 104);

       // добавляем студентов в список
       students.add(s1);
       students.add(s2);
       students.add(s3);
       students.add(s4);
       students.add(s5);
       students.add(s6);

       // создаем HashMap
       HashMap<Long, Student> studentsMap = new HashMap();

       // заполняем HashMap из листа студентов
       for (int i = 0; i < students.size(); i++) {
            Long temp = (long) i;
            studentsMap.put(temp, students.get(i));
       }

       // создаем модель типа HashModel
       HashModel model = new HashModel(studentsMap);

    //    ModelFile fModel = new ModelFile("StudentDB.txt");
    //    //fModel.saveAllStudentToFile(students);

    //    iGetModel modelFile = fModel;
    //    iGetModel model = new ModelList(students);

       // создаем ViewEng
       iGetView view = new ViewEng();

       // создаем Controller и передаем в него HashModel и ViewEng
       Controller control = new Controller(model, view);

       //control.update();
       control.run();

    }
}
