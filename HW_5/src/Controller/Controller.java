package Controller;

import java.util.ArrayList;
import java.util.List;

import Model.ModelList;
import Model.Student;
import View.View;
import View.ViewEng;

public class Controller {

    private iGetModel model;
    private iGetView view;
    private List<Student> students = new ArrayList<>();

    public Controller(iGetModel model, iGetView view) {
        this.model = model;
        this.view = view;
    }

    private boolean testData(List<Student> students)
    {
        if(students.size()>0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public void update()
    {
        //MVP
        students = model.getAllStudents();
        if(testData(students))
        {
           view.printAllStudents(students);
        }
        else
        {
            System.out.println("List students null!!!");
        }

        //MVC
        //view.printAllStudents(model.getAllStudents());
    }

    public void run()
    {
        Command com = Command.NONE;
        boolean getNewIteration = true;
        while(getNewIteration)
        {
            String command = view.prompt("Input command: ");
            com = Command.valueOf(command.toUpperCase());
            switch(com)
            {
                case EXIT:
                    getNewIteration=false;
                    System.out.println("Exit");
                    break;
                case LIST:
                    view.printAllStudents(model.getAllStudents());
                    break;
                case DELETE:
                    model.delStud(view.getStudentIdToDelete());
                    break;
            }

        }
    }

    

}
