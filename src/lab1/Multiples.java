package lab1;

public class Multiples {
    public static void main() {

        System.out.println(multiples(1000,3,5));
    }

    public static int multiples(int n, int a, int b) {
        int count = 0;
        for (int i = 0; i <= n; i++) {
            boolean testMulti = i % a == 0 || i % b == 0;
            if (testMulti) {
                count = count + 1;
            }
        }

        return count;
    }
}
