package Domen;

import java.util.Iterator;
import java.util.List;

/*
 * класс группа студентов, с подключенными итератором и сомпаратором
 */
public class StudentGroup implements Iterable<Student>, Comparable<StudentGroup> {
    private List<Student> group;
    private Integer idGroup;

    public StudentGroup(List<Student> group, Integer idGroup) {
        this.group = group;
        this.idGroup = idGroup;
    }

    public List<Student> getGroup() {
        return group;
    }

    public void setGroup(List<Student> group) {
        this.group = group;
    }

    public Integer getIdGroup() {
        return idGroup;
    }

    public void setIdGroup(Integer idGroup) {
        this.idGroup = idGroup;
    }

     @Override
    public String toString() {
        return "StudentGroup{" +
                "group=" + group +
                ", idGroup=" + idGroup +
                '}';
    }

    @Override
    public Iterator<Student> iterator() {
       return new Iterator<Student>() {

        private int counter;

        @Override
        public boolean hasNext() {

            if(counter<group.size())
            {
                return true;
            }
            else
            {
                return false;
            }            
        }

        @Override
        public Student next() {            
            return group.get(counter++);
        }
        
       };
        
    }

    // переопределяем компаратор 
    @Override
    public int compareTo(StudentGroup gr) {

        // если размеры групп равны, сравниваем по id групп
        if(this.getGroup().size()==gr.getGroup().size())
        {
            if(idGroup==gr.idGroup)return 0 ;
            if(idGroup>gr.idGroup)return 1;
            else return -1;
        }
        // сравнение по размеру группы
        if(this.getGroup().size()>gr.getGroup().size())
        return 1;
        else
        return -1;        
    }
    
    
}
