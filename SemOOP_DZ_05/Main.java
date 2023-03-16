package SemOOP_DZ_05;

import java.util.Scanner;

public class Main {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        Menu m = new Menu();
        boolean flag = true;
        while (flag){
            int chek = m.startMenu();
            if (chek == 1){
                System.out.println("\nВведите первое число: ");
                Rational rat1 = new Rational(1);
                System.out.println("\nВведите второе число: ");
                Rational rat2 = new Rational(1);
                new Operation( m.doChoice(), rat1, rat2);

            }

            if (chek == 2){
                System.out.println("\nВведите первое число: ");
                Complex com1 = new Complex(1);
                System.out.println("\nВведите второе число: ");
                Complex com2 = new Complex(1);
                new Operation(m.doChoice(), com1, com2);
            }
            System.out.println("\nПродолжить - нажмите: 1, если нет: 2");
            int in = input.nextInt();
            if (in == 2) flag = false;

        }
    }
}
