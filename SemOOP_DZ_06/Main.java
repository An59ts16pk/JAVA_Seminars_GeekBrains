package SemOOP_DZ_06;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import SemOOP_DZ_06.MathCalk.Option;
import SemOOP_DZ_06.Logg.MainLogger;
import SemOOP_DZ_06.MathCalk.DivComplex;
import SemOOP_DZ_06.MathCalk.DivRational;
import SemOOP_DZ_06.MathCalk.MinusComplex;
import SemOOP_DZ_06.MathCalk.MinusRational;
import SemOOP_DZ_06.MathCalk.MultComplex;
import SemOOP_DZ_06.MathCalk.MultRational;
import SemOOP_DZ_06.MathCalk.Operation;
import SemOOP_DZ_06.MathCalk.SumComplex;
import SemOOP_DZ_06.MathCalk.SumRational;
import SemOOP_DZ_06.Menu.Menu;

public class Main {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        new Menu();
        new Operation(new MainLogger());

        List<Option> operationsList = new ArrayList<>();
        operationsList.add(new SumRational());
        operationsList.add(new SumComplex());
        operationsList.add(new MinusRational());
        operationsList.add(new MinusComplex());
        operationsList.add(new MultRational());
        operationsList.add(new MultComplex());
        operationsList.add(new DivRational());
        operationsList.add(new DivComplex());

        boolean flag = true;
        while (flag){
            System.out.println("\nВыберите номер действия:");
            for (int i = 0; i < operationsList.size(); i++) {
                System.out.println(i+" - "+operationsList.get(i).discription());
            }
            int chek = input.nextInt();
            operationsList.get(chek).execute();

            System.out.println("\nПродолжить - нажмите: 1, если нет: 2");
            int inp = input.nextInt();
            if (inp == 2) flag = false;

        }
    }
}
