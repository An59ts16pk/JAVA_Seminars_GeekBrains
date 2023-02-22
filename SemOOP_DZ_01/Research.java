package SemOOP_DZ_01;

import java.util.*;

public class Research {
    Scanner input = new Scanner(System.in);

    ArrayList<String> result = new ArrayList<>();
    ArrayList<Node> tree;
    ArrayList<String> resultAge = new ArrayList<>();

    public Research(GeoTree geoTree) {
        tree = geoTree.getTree();
    }

    // метод поиска связи: родитель - ребенок, жена - муж
    public ArrayList<String> spend(Human p, Relationship re) {
        for (Node t : tree) {
            if (t.p1.getFirstName() == p.getFirstName() && t.re == re) {
                result.add(t.p2.getFirstName());
            }
        }
        return result;
    }

    // метод поиска по возрасту
    public ArrayList<String> searchAge() {
        System.out.print("\nВведите ограничение по возрасту: ");
        
        int age = input.nextInt();
        System.out.println("Люди, младше: " + age + ":");

        for (Node t : tree) {

            if (t.p1.getAge() <= age && !resultAge.contains(t.p1.getFirstName())) {
                resultAge.add(t.p1.getFirstName());
            }
        }
        return resultAge;
    }
}
