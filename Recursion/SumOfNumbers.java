package Recursion
class SumOfNumbers {
    public static void main(String[] args) {
        int number = 3;
        System.out.println(sum(number));
    }

    static int sum(int n) {
        if(n == 0) {
            return 0;
        }

        return n + sum(n - 1);
    }
}