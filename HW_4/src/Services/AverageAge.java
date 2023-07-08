package Services;

import java.util.List;

import Controllers.iPersonController;
import Domen.Person;

public class AverageAge <T extends Person>{

    public double getAverageAge(List<T> lst) {
        double res = 0;
        for ( T pers : lst) {
            res += pers.getAge();
        }
        return res / lst.size();
    }
    
}

