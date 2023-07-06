package Domen;

import java.util.Iterator;
import java.util.List;

/*
 * класс потока студентов с реализованным интерфейсом Iterable
 */
public class StudentSteam implements Iterable<StudentGroup>{
    private List<StudentGroup> sStream; // список групп
    private Integer idStream;  // id потока
    
    // конструктор
    public StudentSteam(List<StudentGroup> sStream, Integer idStream) {
        this.sStream = sStream;
        this.idStream = idStream;
    }

    // геттеры-сеттеры...
    public List<StudentGroup> getsStream() {
        return sStream;
    }

    public Integer getIdStream() {
        return idStream;
    }

    public void setsStream(List<StudentGroup> sStream) {
        this.sStream = sStream;
    }

    public void setIdStream(Integer idStream) {
        this.idStream = idStream;
    }

    // переопределяем toString
    @Override
    public String toString() {
        String res = "StudentSteam: " + idStream + "\n";
        for (StudentGroup group : sStream) {
            res += group.toString() + "\n";
        }
        return  res;
    }

    // создаем итератор
    @Override
    public Iterator<StudentGroup> iterator() {
        return new Iterator<StudentGroup>() {

        private int counter;

        @Override
        public boolean hasNext() {

            if(counter<sStream.size())
            {
                return true;
            }
            else
            {
                return false;
            }            
        }

        @Override
        public StudentGroup next() {            
            return sStream.get(counter++);
        }
        
       };
    }

    
}
