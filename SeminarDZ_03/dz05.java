package SeminarDZ_03;

// Задача 1. Реализовать алгоритм сортировки слиянием.

import java.util.*;

public class dz05 {
    private static Scanner input = new Scanner(System.in);
    private static Random random = new Random();

    public static void main(String[] args) {

        int len = getNumberByUser("\nВведите количество элементов массива: ");
        int[] array = createArray(len);
        fillArray(array, 0, 20);
        System.out.println(Arrays.toString(array));

        mergerSortArray(array, array.length);
        System.out.println("\nСортированный массив:");
        System.out.println(Arrays.toString(array));
    }

    // Ввод числа
    public static int getNumberByUser(String text) {
        System.out.print(text);
        return input.nextInt();
    }

    // Создание массива
    public static int[] createArray(int size) {
        return new int[size];
    }

    // Заполнение массива
    public static void fillArray(int[] col, int min, int max) {
        int count = col.length;

        int index = 0;
        while (index < count) {
            col[index] = random.nextInt(min, max);
            index++;
        }
    }

    // Сортировка массива слиянием
    public static void mergerSortArray(int[] arr, int n) {
        if (n < 2) return;

        int i_left = n / 2;         // index left count elem
        int i_right = n - n / 2;    // index right count elem
        int[] left = new int[i_left];
        int[] right = new int[i_right];

        for (int i = 0; i < i_left; i++) {
            left[i] = arr[i];
        }
        for (int i = i_left; i < n; i++) {
            right[i - i_left] = arr[i];
        }

        mergerSortArray(left, i_left);
        mergerSortArray(right, i_right);

        int i = 0, j = 0, k =0;
        while (i < i_left && j < i_right) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }    
        
        while (i < i_left) {
            arr[k++] = left[i++];
        }
        while (j < i_right) {
            arr[k++] = right[j++];
        }
    }
}
