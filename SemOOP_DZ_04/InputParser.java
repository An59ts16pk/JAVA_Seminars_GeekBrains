package SemOOP_DZ_04;

public class InputParser {
    public static int[] inputPars(String[] arr) {
        int result[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = Integer.parseInt(arr[i]);
        }

        return result;
    }
}
