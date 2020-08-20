package Recursion;

public class GenerateSubsets {
    public static void main(String[] args) {
        int[] arr = new int[] {1,2,3,4};
        generateSubsets(arr);
    }

    static void generateSubsets(int[] arr) {
        helper(arr, 0, 0);
    }

    static void helper(int[] arr, int start, int end) {
        if(end == arr.length) {
            return;
        } else if(start > end) {
            helper(arr, 0, end + 1);
        } else {
            // hypothesis:
            System.out.print("[");
            for(int i = start; i < end; i++) {
                System.out.print(arr[i] + ",");
            }

            System.out.println(arr[end] + "]");
            helper(arr, start + 1, end);
        }
        return;
    } 

}