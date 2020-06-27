/**
 * PrintToN
 */
public class PrintToN {
    public static void printFunction(int n) {
        if(n == 0) {
            return;
        }
        System.out.println("Before recursion: " + n);
        printFunction(n - 1);   // Saves it into the recursion stack : quite clearly visible in the solution.
        System.out.println("After recursion: " + n);
        System.out.print(n + " ");
        System.out.println("After printing: " + n);
    }

    public static void main(String[] args) {
        printFunction(10);
    }
}

    /**
    Before recursion: 10
    Before recursion: 9
    Before recursion: 8
    Before recursion: 7
    Before recursion: 6
    Before recursion: 5
    Before recursion: 4
    Before recursion: 3
    Before recursion: 2
    Before recursion: 1
    After recursion: 1
    //////////////////////
    ***** Recursion stack starts printing ******
    1 After printing: 1
    After recursion: 2
    2 After printing: 2
    After recursion: 3
    3 After printing: 3
    After recursion: 4
    4 After printing: 4
    After recursion: 5
    5 After printing: 5
    After recursion: 6
    6 After printing: 6
    After recursion: 7
    7 After printing: 7
    After recursion: 8
    8 After printing: 8
    After recursion: 9
    9 After printing: 9
    After recursion: 10
    10 After printing: 10
    */
