package SemOOP_DZ_05;

public class NodInt {
    public static int nodInt(int x1, int x2) {
        if (x2 == 0) {return x1;}
        return nodInt(x2, x1 % x2);
    }
}
