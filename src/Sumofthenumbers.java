public class Sumofthenumbers {
    static int execute(int n) {
        if (n == 0) {
            return 0;
        } else {
            return n % 10 + execute(n / 10);
        }
}
}
