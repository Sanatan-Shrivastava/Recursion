package Recursion;
import java.util.*;
public class ReverseStack {
   public static void main(String[] args) {
       Stack<Integer> stack = new Stack<Integer>();
       stack.push(1);
       stack.push(3);
       stack.push(5);
       stack.push(7);
       reverse(stack);
       System.out.println(stack);
   } 

   private static void reverse (Stack<Integer> stack) {
       if(!stack.isEmpty()) {
           int x = stack.pop();
           reverse(stack);
           insert(stack, x);
       }
   }

   static void insert(Stack<Integer> stack, int x) {
       if(stack.isEmpty()) {
            stack.push(x);
       } else {
            int popped = stack.pop();
            insert(stack, x);
            stack.push(popped);
       }
   }
}