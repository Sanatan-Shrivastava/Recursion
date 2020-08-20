package Recursion;
import java.util.*;
public class ReverseAQueue {
   public static void main(String[] args) {
       Queue<Integer> queue = new LinkedList<>();
       queue.add(2);
       queue.add(0);
       queue.add(5);
       queue.add(1);
       queue = sortQueue(queue);
       System.out.println(queue);
   } 

   static Queue<Integer> sortQueue(Queue<Integer> queue) {
       if(queue.isEmpty()) {
           return queue;
       } 
       int temp = queue.remove();
       queue = sortQueue(queue);
       queue.offer(temp);
       return queue;
   }
}