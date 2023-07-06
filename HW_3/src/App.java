import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Domen.Student;
import Domen.StudentGroup;
import Domen.StudentSteam;

public class App {
    public static void main(String[] args) throws Exception {

        // создаем несколько студентов
        Student s1 = new Student("Иван", 25, 121);
        Student s2 = new Student("Игорь", 23, 301);
        Student s3 = new Student("Иван", 22, 121);
        Student s4 = new Student("Игорь",  23, 444);
        Student s5 = new Student("Даша",  23, 171);
        Student s6 = new Student("Лена",  23, 104);

        // создаем листы под студентов
        List<Student> listStud1 = new ArrayList<Student>();
        List<Student> listStud2 = new ArrayList<Student>();

        // распределяем студентов по листам
        listStud1.add(s1);
        listStud1.add(s2);
        listStud1.add(s3);
        listStud1.add(s4);
        listStud2.add(s5);
        listStud2.add(s6);
        
        // создаем группы студентов, по спискам
        StudentGroup group45 = new StudentGroup(listStud1, 45);
        StudentGroup group55 = new StudentGroup(listStud2, 55);

        //создаем список групп
        List<StudentGroup> listGroup = new ArrayList<>();

        // добавляем группы в список
        listGroup.add(group45);
        listGroup.add(group55);

        // создаем поток на основании списка групп
        StudentSteam stream111 = new StudentSteam(listGroup, 111);

        // Вывод потока в консоль через переопределенный toString
        System.out.println("Вывод через переопределенный toString");
        System.out.println(stream111);

        // Вывод потока в консоль через цикл
        System.out.println("Вывод через цикл");
        for (StudentGroup gr : stream111.getsStream()) {
            System.out.println(gr);
        }
        System.out.println();

        // сортируем группы в потоке
        Collections.sort(stream111.getsStream());

        System.out.println("Вывод через цикл, после сортировки");
        for (StudentGroup gr : stream111.getsStream()) {
            System.out.println(gr);
        }
    }
}
