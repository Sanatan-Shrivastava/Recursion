package Recursion;
public class LogN {
    static double findFactorial(int num) {
        if(num == 1) {
            return 0;
        }
        return findFactorial(num - 1) + Math.log(num);
    }
    public static void main(String[] args) {
        int n = 3;
        System.out.println(findFactorial(n));
    }
}