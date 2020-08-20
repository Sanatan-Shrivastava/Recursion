package Recursion;
public class SumOfEvenElements {
    public static void main(String[] args) {
        int[] nums = new int[] {1,2,3,4,5};
        int sum = 0;
        evenSum(nums, 0, sum);
        return;
    }

    static void evenSum(int[] nums, int index, int sum) {
        if(index > nums.length - 1) {
            System.out.println(sum);
            return;
        }

        
        if(nums[index] % 2 == 0) {
            sum += nums[index];
        } 
        evenSum(nums, index + 1, sum);
        return;
    }
}