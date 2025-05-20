/**
 * Two Sum Problem - Very common in interviews
 * 
 * Problem: Find two numbers in array that add up to target sum
 * Example: nums = [2, 7, 11, 15], target = 9
 * Output: [0, 1] (because nums[0] + nums[1] = 2 + 7 = 9)
 * 
 * Approach: HashMap (most efficient)
 * 1. Store complements in HashMap
 * 2. For each number, check if its complement exists
 * 
 * Time Complexity: O(n) - single pass through array
 * Space Complexity: O(n) - storing numbers in HashMap
 * 
 * Alternative Approaches:
 * 1. Brute Force - O(n^2) time, O(1) space
 * 2. Sort and Two Pointers - O(nlogn) time, O(1) space
 */
import java.util.HashMap;

public class TwoSum {
    public static int[] findTwoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] {map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        return new int[] {};
    }

    public static void main(String[] args) {
        int[] numbers = {2, 7, 11, 15};
        int target = 9;
        int[] result = findTwoSum(numbers, target);
        
        if (result.length == 2) {
            System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
            System.out.println("Numbers: [" + numbers[result[0]] + ", " + numbers[result[1]] + "]");
        } else {
            System.out.println("No solution found!");
        }
    }
}
