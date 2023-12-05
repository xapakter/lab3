public class Main {
    public static void main(String[] args) {
        int N = 9;
        long resRecur = Factorial.recursionExecute(N);
        long resCycle = Factorial.cycleExecute(N);
        assert resRecur == resCycle : "Different values";
        System.out.println("Факторіал " + N + " (рекурсія): " + resRecur);
        System.out.println("Факторіал " + N + " (цикл): " + resCycle);

        N = 13;
        resRecur = Fibonacci.recursionExecute(N);
        resCycle = Fibonacci.cycleExecute(N);
        assert resRecur == resCycle : "Different values";
        System.out.println("Число Фібоначчі " + N + " (рекурсія): " + resRecur);
        System.out.println("Число Фібоначчі " + N + " (цикл): " + resCycle);

        N = 95;
        resRecur = Sumofthenumbers.execute(N);
        assert resRecur == 14 : "Sum of digits";
        System.out.println("Сума цифр числа " + N + " (рекурсія): " + resRecur);

        int a = 5;
        int b = 10;
        resRecur = SumWithoutPlus.execute(a, b);
        assert resRecur == (a + b) : "Sum wthout plus";
        System.out.println("Сума " + a + " і " + b + " (рекурсія): " + resRecur);
    }
}