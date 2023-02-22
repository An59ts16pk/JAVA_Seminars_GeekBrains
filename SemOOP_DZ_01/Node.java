package SemOOP_DZ_01;

public class Node {
    Human p1;
    Relationship re;
    Human p2;

    public Node(Human p1, Relationship re, Human p2) {
        this.p1 = p1;
        this.re = re;
        this.p2 = p2;
    }

    @Override
    public String toString() {
        return String.format("<%s %s %s %s %s>",
         p1.getFirstName(), p1.getLastName(), re, p2.getFirstName(), p2.getLastName());
    }
}
