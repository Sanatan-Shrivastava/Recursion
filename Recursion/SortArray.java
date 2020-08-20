package Recursion;
import java.util.ArrayList;

public class SortArray {

    public static void sortArray(ArrayList<Integer> nums) {
        if(nums.size() == 1) {
            return;
        }
        int temp = nums.get(nums.size() - 1);
        nums.remove(nums.size() - 1);
        sortArray(nums);
        insertElement(nums, temp);
        return;
    }

    static void insertElement(ArrayList<Integer> nums, int x) {
        if(nums.size() == 0  || x >= nums.get(nums.size() - 1)) {
            nums.add(x);
            return;
        }

        int pop = nums.get(nums.size() - 1);
        nums.remove(nums.size() - 1);
        insertElement(nums, x);
        nums.add(pop);
        return;
    }
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(3);
        nums.add(6);
        nums.add(2);
        nums.add(9);
        nums.add(4);
        sortArray(nums);
        System.out.println(nums);
    }
}