package SeminarDZ_03;

// Задача 3. Задан целочисленный список ArrayList.
// Найти минимальное, максимальное и среднее арифметичское этого списка.

import java.util.*;

public class dz07 {
    private static Scanner input = new Scanner(System.in);
    private static Random random = new Random();

    public static void main(String[] args) {
        int len = getNumberByUser("\nВведите количество чисел списка: ");
        List<Integer> numsList = new ArrayList<>();
        fillList(numsList, len, 0, 20);
        System.out.printf("\nИсходный список: \n%s", numsList);

        float[] result = numMinMaxAverage(numsList);
        System.out.println("\n\nРезультат: ");
        System.out.printf("\nМинимальное число списка:  %d", (int)result[0]);
        System.out.printf("\nМаксимальное число списка: %d", (int)result[1]);
        System.out.printf("\nСреднее арифметическое чисел списка: %.2f", result[2]);
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

    // Метод возвращает минимальное, максимальное и
    // среднее арифметическое списка
    public static float[] numMinMaxAverage(List<Integer> nums) {
        float[] res = new float[3];
        int len = nums.size();

        res[0] = nums.get(0); // min
        res[1] = nums.get(0); // max
        
        for (int i = 0; i < len; i++) {
            if (nums.get(i) < res[0]) {
                res[0] = nums.get(i);
            } else if (nums.get(i) > res[1]) {
                res[1] = nums.get(i);
            }
            res[2] += nums.get(i);
        }
        
        res[2] = res[2] / len;  // average
        return res;
    }
}
