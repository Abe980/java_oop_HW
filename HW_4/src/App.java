import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import Controllers.EmploeeController;
import Controllers.TeacherController;
import Domen.Emploee;
import Domen.Person;
import Domen.PersonComparator;
import Domen.Student;
import Domen.StudentGroup;
import Domen.Teacher;
import Services.AverageAge;
import Services.TeacherService;

public class App {
    public static void main(String[] args) throws Exception {

        // создаем сервис учителей
        TeacherService tchServ = new TeacherService();

        // создаем несколько учителей и добавсяем в список
        tchServ.create("Sidorov", 55);
        tchServ.create("Sidorov", 33);
        tchServ.create("Petorv", 44);

        // выводим в консоль всех учителей
        System.out.println(tchServ.getAll());

        // сортируем учителей сначала по имени, потом по возрасту 
        tchServ.sortByFIOTchLst();

        // выводим в консоль всех учителей после сортировки
        System.out.println(tchServ.getAll());

        // создаем экземпляр класса AverageAge
        AverageAge av = new AverageAge<>();

        // выводим в консоль средний возраст учителей
        System.out.println("Средний возраст: " + av.getAverageAge(tchServ.getAll()));



        


        // Student s1 = new Student("Иван", 25, 121);
        // Student s2 = new Student("Игорь", 23, 301);
        // Student s3 = new Student("Иван", 22, 121);
        // Student s4 = new Student("Игорь",  23, 444);
        // Student s5 = new Student("Даша",  23, 171);
        // Student s6 = new Student("Лена",  23, 104);

        // List<Student> listStud = new ArrayList<Student>();
        // listStud.add(s1);
        // listStud.add(s2);
        // listStud.add(s3);
        // listStud.add(s4);
        // listStud.add(s5);
        // listStud.add(s6);
        

        // StudentGroup group4580 = new StudentGroup(listStud, 4580);
        // System.out.println(group4580);

        // for(Student std : group4580)
        // {
        //     System.out.println(std);
        // }

        // System.out.println("=========================================================");

        // Collections.sort(group4580.getGroup());

        // for(Student std: group4580.getGroup())
        // {
        //     System.out.println(std);
        // }


        // Student s1 = new Student("Иван", 25, 121);
        // Student s2 = new Student("Игорь", 23, 301);

        // PersonComparator<Student> comS = new PersonComparator<Student>();
        // comS.compare(s1, s2);

        // Teacher t1 = new Teacher("Иван", 25, "Docent");
        // Teacher t2 = new Teacher("Игорь", 23, "Professor");

        
        // PersonComparator<Teacher> comT = new PersonComparator<Teacher>();
        // comT.compare(t1, t2);

        // //comS.compare(s1, t2);
        // PersonComparator<Person> comP = new PersonComparator<Person>();
        // comP.compare(s1, t2);

        //Emploee e1 = new Emploee("Федорович", 60, "разнорабочим");
        //EmploeeController empControll = new EmploeeController();
        //EmploeeController.paySalary(e1);
       // EmploeeController.paySalary(s1);
        //empControll.paySalary(e1);
        //empControll.paySalary(s1);

    }
}
