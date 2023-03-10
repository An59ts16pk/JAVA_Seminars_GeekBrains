package SemOOP_DZ_03;

import java.util.*;

public class Research {
    Scanner input = new Scanner(System.in);

    ArrayList<String> result = new ArrayList<>();
    List<List<Node>> tree;
    List<Node> pair;
    ArrayList<String> resultAge = new ArrayList<>();

    public Research(HumanBase hb) {
        tree = hb.getAllTree();
    }

    //метод поиска связи: родитель - ребенок, жена - муж
    public ArrayList<String> spend(Human p, Relationship re) {
        for (List<Node> t : tree) {
            for (Node pr : t) {
                if (pr.p1.getFirstName() == p.getFirstName() && pr.re == re) {
                result.add(pr.p2.getFirstName());}
            }
        }
        return result;
    }
    
    // метод поиска по возрасту
    public ArrayList<String> searchAge() {
        System.out.print("\nВведите ограничение по возрасту: ");
        
        int age = input.nextInt();
        System.out.println("Люди, младше: " + age + ":");

        for (List<Node> tr : tree) {
            for (Node pr : tr) {
                if (pr.p1.getAge() <= age && !resultAge.contains(pr.p1.getFirstName())) {
                    resultAge.add(pr.p1.getFirstName());
                }
            }
        }
        return resultAge;
    }
}
