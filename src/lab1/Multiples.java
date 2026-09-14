package lab1;

public class Multiples {
    public static void main() {

        System.out.println(multiples());
    }

    public static int multiples(int n, int a, int b) {
        int count = 0;
        for (int i = 1; i < n; i++) {
            boolean testMulti = i % a == 0 || i % b == 0;
            if (testMulti) {
                count = count + 1;
            }
        }

        return count;
    }

    public static int multiples() {
        int count = 0;
        for (int i = 1; i < 1000; i++) {
            boolean testMulti = i % 3 == 0 || i % 5 == 0;
            if (testMulti) {
                count = count + 1;
            }
        }

        return count;
    }
}
