package SeminarDZ_06;

import java.util.*;

public class Notebook {
    private int id;
    private String model;
    private String cpu;
    private int ram;
    private int hdd;
    private int ssd;
    private String os;
    private String color;
    private int price;

    public Notebook(int id, String model, String cpu, int ram, int hdd, int ssd, String os, String color, int price) {
        this.id = id;
        this.model = model;
        this.cpu = cpu;
        this.ram = ram;
        this.hdd = hdd;
        this.ssd = ssd;
        this.os = os;
        this.color = color;
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("id: %d  model: %s  cpu: %s  ram: %d  hdd: %d  ssd: %d  os: %s  color: %s  price: %d",
         id, model, cpu, ram, hdd, ssd, os, color, price);
    }

    public int getID() {return id;}
    public String getModel() {return model;}
    public String getCPU() {return cpu;}
    public int getRAM() {return ram;}
    public int getHDD() {return hdd;}
    public int getSSD() {return ssd;}
    public String getOS() {return os;}
    public String getColor() {return color;}
    public int getPrice() {return price;}

    public Notebook() {

    }

    public Scanner input = new Scanner(System.in);

    // фильтрация ноутбуков по выбранным критериям
    public Set<Notebook> filterNotebook(Set<Notebook> notebook) {
        HashMap<String, String> filter = new HashMap<>();
        Set<Notebook> resultNotebook = new HashSet<>(notebook);
        
        System.out.println("\nКритерии фильтрации: 1 - цена, 2 - объём RAM, 3 - объём SSD, 4 - операционная система, 5 - цвет.");
        System.out.println("Введите не более пяти цифр, соответствующих необходимому критерию через пробел: ");
        String[] num = input.nextLine().split(" ");

        // получаем ключи фильтрации от пользователя и их значения,
        // сохраняем в map
        for (int i = 0; i < num.length; i++) {
            if (num[i].equals("1")) {
                System.out.println("Введите максимальную цену (поиск менее или равен введённой цене): ");
                String pr = input.nextLine();
                filter.put("price", pr);
                
            } else if (num[i].equals("2")) {
                System.out.println("Введите минимальный объём ОЗУ (доступны - 4, 6, 8, 16): ");
                String rm = input.nextLine();
                filter.put("ram", rm);
                
            } else if (num[i].equals("3")) {
                System.out.println("Введите минимальный объём SSD (доступны - 60, 120, 128, 240, 320, 512, 850): ");
                String ss = input.nextLine();
                filter.put("ssd", ss);
                
            } else if (num[i].equals("4")) {
                System.out.println("Введите операционную систему (доступны - Windows или Linux): ");
                String ops = input.nextLine();
                filter.put("os", ops);

            } else if (num[i].equals("5")) {
                System.out.println("Введите цвет (доступны - gray, red, black, white): ");
                String cl = input.nextLine();
                filter.put("color", cl);

            } else {
                System.out.println("Такая цифра для фильтрации не применяется!");
            }
        }

        // фильтрация исходного set ноутбуков по ключам и значениям
        for (String key : filter.keySet()) {
            for (Notebook elem : notebook) {
                if (key == "price" && elem.price > Integer.valueOf(filter.get("price"))) {
                    resultNotebook.remove(elem);
                } else if (key == "ram" && elem.ram > Integer.valueOf(filter.get("ram"))) {
                    resultNotebook.remove(elem);
                } else if (key == "ssd" && elem.ssd > Integer.valueOf(filter.get("ssd"))) { 
                    resultNotebook.remove(elem);
                } else if (key == "os" && !elem.os.equals(filter.get("os"))) {
                    resultNotebook.remove(elem);
                } else if (key == "color" && !elem.color.equals(filter.get("color"))) {
                    resultNotebook.remove(elem);
                }
            }
        }
        return resultNotebook;
    }

    // построчная печать списка ноутбуков
    public void printNotebook(Set<Notebook> notebook) {
        System.out.println("\nСписок ноутбуков по выбранным критериям:\n");
        for (Notebook elem : notebook) {
            System.out.println(elem);
        }
    }
}
