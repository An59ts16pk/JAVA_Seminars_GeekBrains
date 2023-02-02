package SeminarDZ_04;

// Задача 3. Напишите постфиксный калькулятор. Пользователь вводит данные и операции
// в обратной польской записи. Калькулятор вычисляет результат и проверяет, 
// что в стэке получилось единственное число.
// Например:   5 4 3 - + => 5 1 + => 6

import java.util.*;

public class dz11 {
    private static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
        Stack<Integer> stackNumbers = new Stack<Integer>();
        
        System.out.println("     Постфиксный калькулятор.");
        System.out.println("\nВведите строку через пробел для калькулятора вида \"5 4 3 - +\": ");
        String inputString = input.nextLine();
        String[] inputArray = inputString.split(" ");

        calcPostFix(stackNumbers, inputArray);
                
        System.out.printf("\nРезультат в стеке: %d", stackNumbers.peek());
        System.out.printf("\nРазмер стека: %d", stackNumbers.size());
    }

    // Посфиксный калькулятор
    public static void calcPostFix(Stack<Integer> stNum, String[] inputArr) {
        for (int i = 0; i < inputArr.length; i++) {
            String temp = inputArr[i];
            if (temp.matches("[-+]?\\d*\\.?\\d+")) {
                stNum.push(Integer.parseInt(temp));
            } else {
                int y = stNum.pop();
                int x = stNum.pop();
                
                if (temp.equals("-")) {
                    stNum.push(x - y);
                } else if (temp.equals("+")) {
                    stNum.push(x + y);
                } else if (temp.equals("*")) {
                    stNum.push(x * y);
                } else if (temp.equals("/")) {
                    stNum.push(x / y);
                }
            }
        }
    }
}
