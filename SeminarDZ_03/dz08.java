package SeminarDZ_03;

// Задача 4. Даны два ArrayList из целых чисел. Написать
// функции, которые вычисляют разницу коллекций:
// Разность:
// A - B = все числа из первой коллекции, которые не содержатся во второй коллекции
// B - A = все числа из второй коллекции, которые не содержатся в первой
// Симметрическая разность:
// A ^ B = числа из первой коллекции, которых нет во второй, А ТАКЖЕ числа из второй,
// которых нет в первой

import java.util.*;

public class dz08 {
    private static Scanner input = new Scanner(System.in);
    private static Random random = new Random();

    public static void main(String[] args) {
        int len1 = getNumberByUser("\nВведите количество чисел  список 1: ");
        int len2 = getNumberByUser("\nВведите количество чисел  список 2: ");
        List<Integer> numsList1 = new ArrayList<>();
        List<Integer> numsList2 = new ArrayList<>();
        fillList(numsList1, len1, 0, 20);
        fillList(numsList2, len2, 0, 20);
        System.out.printf("\nИсходный список 1: \n%s", numsList1);
        System.out.printf("\nИсходный список 2: \n%s", numsList2);

        List<Integer> result1 = collectionDifference(numsList1, numsList2);
        System.out.printf("\n\nРазность первой и второй коллекций: \n%s", result1);
        List<Integer> result2 = collectionDifference(numsList2, numsList1);
        System.out.printf("\n\nРазность второй и первой коллекций: \n%s", result2);

        List<Integer> result = symmetricalDifference(numsList1, numsList2);
        System.out.printf("\n\nСимметрическая разность двух коллекций: \n%s", result);
    }

    // Ввод числа
    public static int getNumberByUser(String text) {
        System.out.print(text);
        return input.nextInt();
    }

    // Заполнение списка
    public static void fillList(List<Integer> nums, int count, int min, int max) {
        for (int i = 0; i < count; i++) {
            nums.add(random.nextInt(min, max));
        }
    }

    // Разность коллекций
    public static List<Integer> collectionDifference(List<Integer> col1, List<Integer> col2) {
        List<Integer> res = new ArrayList<>();

        for (Integer num : col1){
            if (! col2.contains(num) && ! res.contains(num)){
                res.add(num);
            }
        }            
        
        return res;
    }
    
    // Симметрическая разность двух коллекций
    public static List<Integer> symmetricalDifference(List<Integer> col1, List<Integer> col2) {
        List<Integer> res = new ArrayList<>();

        for (Integer num : col1){
            if (! col2.contains(num) && ! res.contains(num)){
                res.add(num);
            }
        }
        for (Integer num : col2){
            if (! col1.contains(num) && ! res.contains(num)){
                res.add(num);
            }
        }

        return res;
    }
}
