import java.sql.Date;

import Task1.Accounting;
import Task1.Employee;
import Task2.Bus;
import Task2.Car;
import Task2.SpeedCalculation;

public class App {
    public static void main(String[] args) throws Exception {
        
        // Task1
        System.out.println("Task1");

        // создаем нового работника
        Employee emp1 = new Employee("Ivanov", new Date(2000,11, 22), 100000);

        // создаем новую бухгалтерию... или отдел... или начисление одной из частей ЗП
        Accounting acc = new Accounting();

        // в бухгалтерию передаем работника и печатаем результат подсчета ЗП
        System.out.println(acc.calculateNetSalary(emp1));

        System.out.println();

        // Task2
        System.out.println("Task2");

        // создаем автобус и автомобиль
        Bus bus1 = new Bus(150, 0.6);
        Car car1 = new Car(250, 0.8);

        // создаем счетчик допустимой скорости
        SpeedCalculation sc = new SpeedCalculation();

        // печатаем допустимую скорость для автобуса bus1
        System.out.println("Bus: " + sc.calculateAllowedSpeed(bus1));
        // печатаем допустимую скорость для автомобиля car1
        System.out.println("Car: " + sc.calculateAllowedSpeed(car1));

        // Task3
        System.out.println();
        System.out.println("Task3");
        System.out.println("Задание3 тоже сделано :)");
    }

    
}
