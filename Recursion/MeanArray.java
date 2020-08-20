package Recursion;
public class MeanArray {
   public static void main(String[] args) {
       int[] nums = {1,2,3,4,5};
       int n = nums.length;
       System.out.println(findMean(nums, n));
   } 

   static double findMean(int[] nums, int n) {
       if(n == 1) {
            return nums[n - 1];
       } else {
            return findMean(nums, n - 1) * (n - 1) + nums[n - 1]/n; 
       }
   }
}