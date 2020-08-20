package Recursion;

public class SumOfSeries {
   public static void main(String[] args) {
       int n = 2;
       System.out.println(findSeries(n));
   } 

   static long findSeries(int n) {
       if(n == 1) {
           return 1;
       }

       return(long)Math.pow(n,n) + (n - 1);
   }
}
