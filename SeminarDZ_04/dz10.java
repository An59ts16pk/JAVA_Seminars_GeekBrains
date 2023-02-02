package SeminarDZ_04;

// Задача 2. Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди, dequeue() - возвращает 
// первый элемент из очереди и удаляет его, first() - возвращает первый
// элемент из очереди, не удаляя.

import java.util.*;

public class dz10 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        LinkedList<Integer> numberLList = new LinkedList<>();

        int len = getNumberByUser("\nВведите количество элементов очереди: ");
        fillLinkedListNums(numberLList, len);
        System.out.println(numberLList.toString());

        int num = getNumberByUser("\n   Введите число для добавления в очередь: ");
        enqueue(numberLList, num);
        System.out.println("\nОчередь с добавленным элементом в конец очереди: ");
        System.out.println(numberLList.toString());

        System.out.println("\n   Удаляем первый элемент очереди:");
        int elemDellFirst = denqueue(numberLList);
        System.out.printf("\nПервый удалённый элемент очереди: %d", elemDellFirst);
        System.out.println("\nЭлементы очереди после удаления первого элемента: ");
        System.out.println(numberLList.toString());

        System.out.println("\n   Смотрим первый элемент очереди:");
        int elemFirst = first(numberLList);
        System.out.printf("\nПервый элемент очереди: %d", elemFirst);
        System.out.println("\nЭлементы очереди: ");
        System.out.println(numberLList.toString());
    }

    // Ввод числа
    public static int getNumberByUser(String text) {
        System.out.print(text);
        return input.nextInt();
    }

    // Заполнение списка
    public static void fillLinkedListNums(LinkedList<Integer> col, int count) {
        int index = 1;
        while (index <= count) {
            col.add(index);
            index++;
        }
    }

    // Помещает элемент в конец очереди
    public static void enqueue(LinkedList<Integer> numLList, int n) {
        numLList.add(n);
    }

    // Возвращает первый элемент из очереди и удаляет его
    public static int denqueue(LinkedList<Integer> numLList) {
        int num = numLList.removeFirst();
        return num;
    }

    // Возвращает первый элемент из очереди, не удаляя
    public static int first(LinkedList<Integer> numLList) {
        int num = numLList.getFirst();
        return num;
    }
}
