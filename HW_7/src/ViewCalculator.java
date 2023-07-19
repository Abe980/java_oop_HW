

import java.util.Scanner;

public class ViewCalculator {

    private iCalculable calculator;

    public ViewCalculator(iCalculable calculator) {
        this.calculator = calculator;
    }

    public void run() {
        while (true) {
            int primaryArgD = promptInt("Введите действительную часть первого аргумента: ");
            int primaryArgM = promptInt("Введите мнимую часть первого аргумента: ");
            calculator.sum(primaryArgD, primaryArgM);
            //iCalculable calculator = calculableFactory.create(primaryArg);
            while (true) {
                String cmd = prompt("Введите команду (*, +, /, =) : ");
                if (cmd.equals("*")) {
                    int argD = promptInt("Введите действительную часть второго аргумента: ");
                    int argM = promptInt("Введите мнимую часть второго аргумента: ");
                    calculator.multi(argD, argM);
                    continue;
                }
                if (cmd.equals("/")) {
                    int argD = promptInt("Введите действительную часть второго аргумента: ");
                    int argM = promptInt("Введите мнимую часть второго аргумента: ");
                    calculator.divide(argD, argM);
                    continue;
                }
                if (cmd.equals("+")) {
                    int argD = promptInt("Введите действительную часть второго аргумента: ");
                    int argM = promptInt("Введите мнимую часть второго аргумента: ");
                    calculator.sum(argD, argM);
                    continue;
                }
                if (cmd.equals("=")) {
                    int[] result = calculator.getResult();
                    System.out.printf("Результат %d+i*(%d)\n", result[0], result[1]);
                    break;
                }
            }
            String cmd = prompt("Еще посчитать (Y/N)?");
            if (cmd.equals("Y")) {
                continue;
            }
            break;
        }
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    private int promptInt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return Integer.parseInt(in.nextLine());
    }
}
