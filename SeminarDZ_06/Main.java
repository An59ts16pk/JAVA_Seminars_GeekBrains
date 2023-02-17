package SeminarDZ_06;

/*
 * 1. Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы.
 * 2. Создать множество ноутбуков.
 * 3. Написать метод, который будет запрашивать у пользователя критерий (или критерии)
 *    фильтрации и выведет ноутбуки, отвечающие фильтру.
 *    Критерии фильтрации можно хранить в Map. Например:
 *    “Введите цифру, соответствующую необходимому критерию:
 *     1 - ОЗУ
 *     2 - Объем ЖД
 *     3 - Операционная система
 *     4 - Цвет …
 * 4. Далее нужно запросить минимальные значения для указанных критериев - 
 *    сохранить параметры фильтрации можно также в Map.
 * 5. Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
 */

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Notebook nb1 = new Notebook(1, "ASUS", "Intel", 4, 640,
         60, "Windows", "gray", 25000);
        Notebook nb2 = new Notebook(2, "HP", "AMD", 4, 0,
         120, "Linux", "gray", 24000);
        Notebook nb3 = new Notebook(3, "MSI", "AMD", 4, 0,
         240, "Linux", "white", 28000);
        Notebook nb4 = new Notebook(4, "ASUS", "AMD", 4, 0,
         240, "Linux", "gray", 25500);
        Notebook nb5 = new Notebook(5, "DELL", "Intel", 6, 0,
         320, "Windows", "red", 32000);
        Notebook nb6 = new Notebook(6, "MSI", "Intel", 6, 0,
         240, "Windows", "black", 30000);
        Notebook nb7 = new Notebook(7, "MSI", "AMD", 8, 0,
         512, "Linux", "gray", 38000);
        Notebook nb8 = new Notebook(8, "ASUS", "Intel", 8, 0,
         512, "Windows", "white", 40000);
        Notebook nb9 = new Notebook(9, "MSI", "AMD", 8, 0,
         240, "Linux", "gray", 28000);
        Notebook nb10 = new Notebook(10, "ASUS", "Intel", 16, 0,
         850, "Windows", "red", 50000);
        Notebook nb11 = new Notebook(11, "DELL", "Intel", 8, 0,
         512, "Windows", "white", 47000);
        Notebook nb12 = new Notebook(12, "ASUS", "AMD", 8, 1000,
         128, "Windows", "gray", 39000);
        Notebook nb13 = new Notebook(13, "HP", "AMD", 8, 0,
         240, "Windows", "black", 32000);
        Notebook nb14 = new Notebook(14, "ASUS", "Intel", 16, 0,
         512, "Windows", "gray", 52000);
        Notebook nb15 = new Notebook(15, "ASUS", "Intel", 8, 0,
         512, "Windows", "gray", 45000);

        Set<Notebook> notebook = new HashSet<>();
        notebook.add(nb1);
        notebook.add(nb2);
        notebook.add(nb3);
        notebook.add(nb4);
        notebook.add(nb5);
        notebook.add(nb6);
        notebook.add(nb7);
        notebook.add(nb8);
        notebook.add(nb9);
        notebook.add(nb10);
        notebook.add(nb11);
        notebook.add(nb12);
        notebook.add(nb13);
        notebook.add(nb14);
        notebook.add(nb15);
        
        Notebook resultNotebook = new Notebook();

        System.out.println("\n    Программа отбора ноутбуков по критериям выбора.");
        resultNotebook.printNotebook(resultNotebook.filterNotebook(notebook));
    }
}
