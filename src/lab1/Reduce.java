package lab1;

public class Reduce {
    public static void main() {

        System.out.println(reduce(1000));

    }

    public static int reduce(int i) {
        int steps = 0;
        while (i != 0) {
            if (i % 2 == 0) {
                i = i / 2;
                steps += 1;
            }
            else {
                i = i - 1;
                steps += 1;
            }
        }
        return steps;
    }
}
