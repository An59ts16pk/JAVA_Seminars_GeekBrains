package SemOOP_DZ_03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.*;

public class HumanBase extends Human implements TreeModel, Serializable {
    public static Scanner input = new Scanner(System.in);
    private List<List<Node>> family = new ArrayList<>();
    
    public Human addDateNewHuman() {

        System.out.println("Введите имя:");
        String fn = input.next();
        System.out.println("Введите отчество:");
        String sn = input.next();
        System.out.println("Введите фамилию:");
        String ln = input.next();
        System.out.println("Введите пол(м/ж):");
        String gender = input.next();
        System.out.println("Введите возраст:");
        int age = input.nextInt();

        return CreateHuman.getInstance()
                .setID()
                .setFirstName(fn)
                .setSecondName(sn)
                .setLastName(ln)
                .setAge(age)
                .setGender(gender)
                .create();
    }

    @Override
    public void getTreeByOneHuman() {
        System.out.println("Для поиска человека");
        System.out.println("Введите имя:");
        String fn = input.next();
        System.out.println("Введите отчество: ");
        String sn = input.next();
        System.out.println("Введите фамилию:");
        String ln = input.next();

        for (var elem : family) {
            for (Node el : elem) {
                if (el.p1.getFirstName().equals(fn) && el.p1.getSecondName().equals(sn) && el.p1.getLastName().equals(ln)) {
                    System.out.println(el.p1.getFirstName() + " " + el.p1.getSecondName() + " " + el.p1.getLastName() + " " + el.re);
                    System.out.println(el.p2.getFirstName() + " " + el.p2.getSecondName() + " " + el.p2.getLastName());
                }
            }
        }
    }

    public List<List<Node>> getAllTree() {
        return family;
    }

    public void setFamily(List<Node> relatives) {
        this.family.add(relatives);
    }
}
