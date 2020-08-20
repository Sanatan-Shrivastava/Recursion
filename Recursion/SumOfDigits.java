package Recursion;
public class SumOfDigits {
    public static void main(String[] args) {
        int x = 15;
        System.out.println(sumDigits(x));
    }

    public static int sumDigits (int x) {
        if(x <= 0) {
            return 0;
        }
        return x % 10 + sumDigits(x / 10);
    }
}