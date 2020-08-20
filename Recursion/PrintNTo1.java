package Recursion;
public class PrintNTo1 {
    public static void printFunction(int n) {
        if(n == 0) {
            return;
        }
        System.out.print(n + " "); // print juut before putting it into recursion stack;
        System.out.println();
        printFunction(n - 1);   // Saves it into the recursion stack : quite clearly visible in the solution.
    }

    public static void main(String[] args) {
        printFunction(10);
    } 
}