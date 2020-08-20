package Recursion;

public class FactorialOfN {
    public static int printFactorial(int n) {
        if(n < 2) {
            return 1;
        }
        return n*printFactorial(n - 1);
    }

    public static void main(String[] args) {
        System.out.println("Result :" + printFactorial(3));
    }  
}