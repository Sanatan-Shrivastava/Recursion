package Recursion;
public class PrintToN {
    public static void printFunction(int n) {
        if(n == 0) {
            return;
        }
        System.out.println("Before recursion: " + n);
        printFunction(n - 1);   
        System.out.println("After recursion: " + n);
        System.out.print(n + " ");
        System.out.println("After printing: " + n);
    }

    public static void main(String[] args) {
        printFunction(10);
    }
}