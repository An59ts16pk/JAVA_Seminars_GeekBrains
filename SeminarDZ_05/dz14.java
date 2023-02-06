package SeminarDZ_05;

// Задача 3. Реализовать алгоритм пирамидальной сортировки (HeapSort).

import java.util.*;

public class dz14 {
    private static Random random = new Random();

    public static void main(String[] args) {
        int[] numbersArray = new int[10];
        fillNumberArray(numbersArray);
        System.out.println("\nИсходный массив:");
        System.out.println(Arrays.toString(numbersArray));

        System.out.println("\nСортированный массив пирамидальной сортировкой:");
        heapSort(numbersArray);
        System.out.println(Arrays.toString(numbersArray));
    }

    // Заполняем массив случайными числами
    private static void fillNumberArray(int[] numArr) {
        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = random.nextInt(1, 21);
        }
    }
    
    // сортировка массива кучей
    private static void heapSort(int[] numArr) {
        int n = numArr.length;

        // Сборка максимума кучи
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(numArr, n, i);
          }
        
        // сортировка кучи
        for (int i = n - 1; i >= 0; i--) {
            int temp = numArr[0];
            numArr[0] = numArr[i];
            numArr[i] = temp;
 
            heapify(numArr, i, 0);
        }  
    }
    
    // сортировка отдельного родителя и его двух потомков
    // элемент с большим значением переносится на вершину
    private static void heapify(int arr[], int n, int i) {
        int largest = i;       // индекс родителя (верхний узел)
        int left = 2*i + 1;    // индекс левый потомок
        int right = 2*i + 2;   // индекс правый потомок

        if (left < n && arr[left] > arr[largest])
        largest = left;

        if (right < n && arr[right] > arr[largest])
        largest = right;

        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;
            
            heapify(arr, n, largest);
        }
    }
}
