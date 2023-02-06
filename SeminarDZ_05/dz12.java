package SeminarDZ_05;

import java.util.*;;

// Задача 1. Реализуйте структуру телефонной книги с помощью HashMap,
// учитывая, что один человек может иметь несколько телефонов.

public class dz12 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        HashMap<String, List<String>> phoneBook = new HashMap<>();
        
        while (true) {
            try {
                System.out.println("\n      Телефонная книга.");
                System.out.println("Команды: 1 - добавить контакт или обновить; 2 - удалить контакт; 3 - найти контакт;");
                System.out.println("         4 - вывести на печать весю телефонную книгу;");
                System.out.println("         5 - очистить всю книгу; 6 - выход из программы.");
                System.out.print("Введите команду для работы с телефонной книгой: ");
                int command = input.nextInt();
                input.nextLine();
                if (command < 1 || command > 6) {
                    System.out.println("\nТакой команды нет. Попробуйте ввести заново.");
                } else if (command == 1) {
                    addContakt(phoneBook);
                } else if (command == 2) {
                    dellContakt(phoneBook);
                } else if (command == 3) {
                    findContakt(phoneBook);
                } else if (command == 4) {
                    printPhBook(phoneBook);
                } else if (command == 5) {
                    dellContaktsPhBook(phoneBook);
                } else if (command == 6) {
                    System.out.println("\nВы вышли из программы.");
                    break;
                }
            } catch (Exception ex) {
                System.out.println("Ошибка. Введена не цифровая команда. Начните заново.");
                break;
            }    
        }
    }

    // Добавить контакт или обновить
    private static void addContakt(HashMap<String, List<String>> phBook) {
        System.out.println("\nКоманда добавить контакт или обновить. ");
        System.out.println("  Введите фамилию (и/или) имя контакта: ");
        String name = input.nextLine();
        System.out.println("  Введите номер или номера телефонов через пробел: ");
        String numberPhone = input.nextLine();
        String[] nPh = numberPhone.split(" ");

        List<String> contactList = new ArrayList<>();
        contactList = Arrays.asList(nPh);
        if (! phBook.containsKey(name)) {
            phBook.put(name, contactList);
        } else {
            phBook.replace(name, contactList);
        }
    }

    // Удалить контакт
    private static void dellContakt(HashMap<String, List<String>> phBook) {
        System.out.println("\nКоманда удаления контакта. ");
        System.out.println("  Введите фамилию (и/или) имя контакта: ");
        String name = input.nextLine();

        if (phBook.containsKey(name)) {
            phBook.remove(name);
            System.out.printf("Контакт %s удалён из телефонной книги.", name);
        } else {
            System.out.printf("Контакт %s отсутствует в телефонной книге.", name);
        }
    }

    // Найти контакт
    private static void findContakt (HashMap<String, List<String>> phBook) {
        System.out.println("\nКоманда поиска списка телефонов по имени.");
        System.out.println("  Введите фамилию (и/или) имя контакта: ");
        String name = input.nextLine();

        if (phBook.containsKey(name)) {
            System.out.printf("Телефоны %s: ", name);
            System.out.println(phBook.get(name).toString());
        } else {
            System.out.printf("Контакт %s отсутствует в телефонной книге.", name);
        }       
    }

    // Печать справочника
    private static void printPhBook (HashMap<String, List<String>> phBook) {
        System.out.println("\nВывод всей телефонной книги: ");
        System.out.println(phBook);
    }

    // Удалить все контакты
    private static void dellContaktsPhBook(HashMap<String, List<String>> phBook) {
        phBook.clear();
        System.out.println("\n  Удалены все контакты телефонной книги. ");
    }
}
