package SeminarDZ_02;

// Задача 2. Реализуйте алгоритм сортировки пузырьком числового массива,
// результат после каждой итерации запишите в лог-файл.

import java.util.*;
import java.util.logging.*;

public class dz03 {
    private static Scanner input = new Scanner(System.in);
    private static Random random = new Random();

    private static final Logger logger = Logger.getLogger(dz03.class.getName());
    
    public static void main(String[] args) throws Exception {
        
        int len = getNumberByUser("\nВведите количество элементов массива: ");
        int[] items = createArray(len);
        fillArray(items, 0, 20);
        System.out.println(printArray(items));
        bubbleSortArray(items);
        System.out.println("\nСортированный массив:");
        System.out.println(printArray(items));
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

    // Печать массива
    public static String printArray(int[] data) {
        StringBuilder output = new StringBuilder();
        output.append("[");
        int count = data.length;

        int index = 0;
        while (index < count) {
            output.append(data[index]);
            if (index < count-1) {
                output.append(",");
            } else {
                output.append("]");
            }
            index++;
        }
        return output.toString();
    }

    // Сортировка массива пузырьком с логированием
    public static void bubbleSortArray(int[] data) throws Exception{
        FileHandler fh = new FileHandler("log.txt");
        logger.setUseParentHandlers(false);
        logger.addHandler (fh);
        SimpleFormatter sFormat = new SimpleFormatter ();
        fh.setFormatter(sFormat);
        
        for (int i = 0; i < data.length - 1; i++) {
            for(int j = 0; j < data.length - i - 1; j++) {
                if(data[j + 1] < data[j]) {
                    logger.log(Level.INFO, String.format("start iteration %d: mean %d (index: %d)  ->  mean %d (index: %d)",
                     i, data[j], j, data[j+1], j+1));
                    
                    int swap = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = swap;

                    logger.log(Level.INFO, String.format("swap  iteration %d: mean %d (index: %d) swap mean %d (index: %d)\n",
                     i, data[j], j, swap, j+1));
                }
            }
        }
        
    }
}
