public class Fibonacci {
    public static long recursionExecute(int n) {
        if (n <= 1) {
            return n;
        } else {
            return recursionExecute(n - 1) + recursionExecute(n - 2);
        }
    }

    public static long cycleExecute(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int a = 0;
        int b = 1;
        int c;
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }
}