package SemOOP_DZ_04;

/**
 * С учетом информации полученной ранее знакомимся с параметрическим полиморфизмом
 * и продолжаем погружаться в ООП.
 * Спроектировать и реализовать планировщик дел для работы с задачами разных приоритетов.
 * Например:
 * определить уровень приоритетов: низкий, средний, немедленное выполнение
 * выделить компоненту для хранения данных
 * выделить компоненту для организации импорта\экспорта данных
 * Файл должен содержать следующие данные: id, дату добавления записи, время добавления
 * записи, дедлай задачи, ФИО автора,
 * данные хранятся в файле csv/jsom/xml
 * другие компоненты
 */

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        // TaskBase<String> tb1 = new TaskBase<>();
        // tb1.add(tb1.createPlan(1)
        //     .setCreateDate("02.02.2023")
        //     .setCreateTime("9:25")
        //     .setNotation("Task1")
        //     .setPriority("HIGH")
        //     .setDeadline("26 hours")
        //     .setAuthor("Petrov"));

        // TaskBase<String> tb2 = new TaskBase<>();
        // tb2.add(tb2.createPlan(2)
        //     .setCreateDate("12.02.2023")
        //     .setCreateTime("12:25")
        //     .setNotation("Task2")
        //     .setPriority("LOW")
        //     .setDeadline("30 day")
        //     .setAuthor("Sidorov"));

        // SaveToCSV.saveToCSV(tb1);
        // SaveToCSV.saveToCSV(tb2);

        // LoadOfCSV rf = new LoadOfCSV();
        // rf.loadOfCSV();
        
        while (true) {
            System.out.println("\nДействия: 1 - вывод записей из файла; 2 - добавить запись; любая цифра - выход");
            System.out.println("\nВыбирите действие: ");
            String res = input.next();

            if (res.equals("1")) {
                System.out.println("\nВыбрано действие - вывод всех записей из файла: ");

                LoadOfCSV rf1 = new LoadOfCSV();
                rf1.loadOfCSV();

            } else if (res.equals("2")) {
                String priorZ = "";
                System.out.println("\nВыбрано действие - добавить запись: ");

                System.out.println("Введите номер задачи: ");
                int num = input.nextInt();
                input.nextLine();
                System.out.println("Введите дату записи задачи: ");
                String dateZ = input.nextLine();
                System.out.println("Введите время записи задачи: ");
                String timeZ = input.nextLine();
                System.out.println("Введите описание задачи: ");
                String taskZ = input.nextLine();

                System.out.println("Введите приоритет задачи (low; medium; high): ");
                String tmp = input.next();
                if (tmp.equals("low")) {
                    priorZ = "LOW";
                } else if (tmp.equals("medium")) {
                    priorZ = "MEDIUM";
                } else if (tmp.equals("high")) {
                    priorZ = "HIGH";
                }
                input.nextLine();
                System.out.println("Введите краний срок задачи: ");
                String deadLZ = input.nextLine();
                System.out.println("Введите автора задачи: ");
                String avt = input.nextLine();

                TaskBase<String> tb = new TaskBase<>();
                tb.add(tb.createPlan(num)
                    .setCreateDate(dateZ)
                    .setCreateTime(timeZ)
                    .setNotation(taskZ)
                    .setPriority(priorZ)
                    .setDeadline(deadLZ)
                    .setAuthor(avt));

                    SaveToCSV.saveToCSV(tb);

            } else break;
        }
    }
}
