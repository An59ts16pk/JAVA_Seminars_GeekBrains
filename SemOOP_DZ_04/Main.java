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
import java.time.LocalDate;
import java.time.LocalTime;

public class Main {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        // TaskBase<String> tb1 = new TaskBase<>();
        // tb1.add(tb1.createPlan(1)
        //     .setCreateDate("02.02.2023")
        //     .setCreateTime("9:25")
        //     .setNotation("Task1")
        //     .setPriority(1)
        //     .setDeadline("26 hours")
        //     .setAuthor("Petrov"));

        // TaskBase<String> tb2 = new TaskBase<>();
        // tb2.add(tb2.createPlan(2)
        //     .setCreateDate("12.02.2023")
        //     .setCreateTime("12:25")
        //     .setNotation("Task2")
        //     .setPriority(10)
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
                System.out.println("\nВыбрано действие - добавить запись: ");

                System.out.println("Введите номер задачи: ");
                int num = input.nextInt();
                input.nextLine();
                
                System.out.println("Введите дату записи задачи - год, месяц, день через пробел: ");
                String[] tempD = input.nextLine().split(" ");
                int[] tmpD =  InputParser.inputPars(tempD);
                LocalDate dateZ = LocalDate.of(tmpD[0], tmpD[1], tmpD[2]);

                System.out.println("Введите время записи задачи - часы, минуты через пробел: ");
                String[] tempT = input.nextLine().split(" ");
                int[] tmpT = InputParser.inputPars(tempT);
                LocalTime timeZ = LocalTime.of(tmpT[0], tmpT[1]);

                System.out.println("Введите описание задачи: ");
                String taskZ = input.nextLine();

                System.out.println("Введите приоритет задачи: 1 - высокий, 2 - средний, 3 - низкий: ");
                int priorZ = input.nextInt();
                input.nextLine();
                
                System.out.println("Введите дату кранего срока задачи - год, месяц, день через пробел: ");
                String[] temp = input.nextLine().split(" ");
                int[] tmp = InputParser.inputPars(temp);
                //LocalDate deadLZ = LocalDate.of(2023, 03, 16);
                LocalDate deadLZ = LocalDate.of(tmp[0], tmp[1], tmp[2]);

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
