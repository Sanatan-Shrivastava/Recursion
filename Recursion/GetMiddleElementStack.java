package Recursion;
import java.util.*;
class GetMiddleElementStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        int k = stack.size()/2 + 1;
        getMiddle(stack, k);
    }

    static void getMiddle(Stack<Integer> stack, int k) {
        if(k == 1) {
            System.out.println(stack.pop());
            return;
        } else {
            int popped = stack.pop();
            getMiddle(stack,k - 1);
            stack.push(popped);
        }
    }
}