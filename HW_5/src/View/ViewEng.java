package View;

import java.util.List;
import java.util.Scanner;

import Controller.iGetView;
import Model.HashModel;
import Model.Student;


public class ViewEng implements iGetView {

    public void printAllStudents(List<Student> students)
    {
        System.out.println("------List ctudents--------");
        for(Student stud: students)
        {
            System.out.println(stud);
        }
        System.out.println("===============================");
    }

    @Override
    public void printAllStudent(List<Student> students) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'printAllStudent'");
    }

    @Override
    public String prompt(String msg) {
       Scanner in = new Scanner(System.in);
       System.out.print(msg);
       return in.nextLine();
    }

    @Override
    public Long getStudentIdToDelete() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input id student");
        return Long.parseLong(sc.nextLine());
    }

    
    @Override
    public void displayStudents(List<Student> students) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'displayStudents'");
    }

    @Override
    public Student readStudent() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'readStudent'");
    }

    @Override
    public Long getStudentIdToUpdate() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getStudentIdToUpdate'");
    }
    
}
