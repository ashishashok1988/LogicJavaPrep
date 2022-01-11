package ashish2021;

public class FibnocciSeries {

    static int num = 10;

    static int f1 = 0, f2 = 1;

    public static void main(String[] args) {

        for (int i = 0; i < num; i++) {
            System.out.println(recurFib(i));
        }

    }

    public static void printFinnociSeries() {

        int f1 = 0, f2 = 1;
        for (int i = 1; i < num; i++) {
            System.out.println(f2);
            int next = f1 + f2;
            f1 = f2;
            f2 = next;
        }

    }

    public static int recurFib(int n) {
        if (n <= 1) {
            return n;
        }

        return recurFib(n - 1) + recurFib(n - 2);
    }
}
