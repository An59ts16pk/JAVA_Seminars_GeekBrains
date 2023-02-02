package SeminarDZ_04;

// Задача 1. Пусть дан LinkedList с несколькими элементами.
// Реализуйте метод, который вернет “перевернутый” список.

import java.util.*;

public class dz09 {
    private static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
        int len = getNumberByUser("\nВведите количество элементов списка: ");
        LinkedList<Integer> numberList = new LinkedList<>();
        fillLinkedListNums(numberList, len);
        System.out.println(numberList.toString());

        numberList = reverseLinkedListNums(numberList);
                
        System.out.println("\nПеревёрнутый список:");
        System.out.println(numberList.toString());
    }

    // Ввод числа
    public static int getNumberByUser(String text) {
        System.out.print(text);
        return input.nextInt();
    }

    // Заполнение списка
    public static void fillLinkedListNums(LinkedList<Integer> col, int count) {
        int index = 0;
        while (index < count) {
            col.add(index);
            index++;
        }
    }

    // Переворачивание связанного списка (Вариант 1)
    // public static LinkedList<Integer> reverseLinkedListNums(LinkedList<Integer> colNums) {
    //     LinkedList<Integer> revColNums = new LinkedList<>();

    //     for (int i = colNums.size()-1; i >= 0; i--) {
    //         revColNums.add(colNums.get(i));
    //     }
    //     return revColNums;
    // }

    // Переворачивание связанного списка (Вариант 2)
    public static LinkedList<Integer> reverseLinkedListNums(LinkedList<Integer> colNums) {
        for (int i = 0; i < colNums.size()/2; i++) {
            int temp = colNums.get(i);
            colNums.set(i, colNums.get(colNums.size()-i-1));
            colNums.set(colNums.size()-i-1, temp);
        }
        return colNums;
    }
}
