package SeminarDZ_03;

// Задача 2. Пусть дан произвольный список целых чисел.
// Удалить из него чётные числа.

import java.util.*;

public class dz06 {
    private static Scanner input = new Scanner(System.in);
    private static Random random = new Random();

    public static void main(String[] args) {
        int len = getNumberByUser("\nВведите количество чисел списка: ");
        List<Integer> numsList = new ArrayList<>();
        fillList(numsList, len, 0, 20);
        System.out.printf("\nИсходный список: \n%s", numsList);

        filterOddNumsList(numsList);
        System.out.printf("\n\nСписок не чётных чисел: \n%s", numsList);
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

    // Метод получения списка не чётных чисел
    public static void filterOddNumsList(List<Integer> nums) {
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) % 2 == 0) {
                nums.remove(i);
                i--;
            }
        }
    }
}
