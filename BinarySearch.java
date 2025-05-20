/**
 * Binary Search Implementation
 * 
 * Problem: Find target element in a sorted array
 * Example: Find 7 in [1, 3, 5, 7, 9, 11] → returns index 3
 * 
 * Approach: Divide and Conquer
 * 1. Find middle element
 * 2. If target > middle, search right half
 * 3. If target < middle, search left half
 * 4. Repeat until found or not found
 * 
 * Time Complexity: O(log n)
 * Space Complexity: O(1) iterative, O(log n) recursive
 * 
 * Requirements:
 * - Array MUST be sorted
 * - Random access to elements (array-like structure)
 * 
 * Interview Tips:
 * - Discuss handling duplicates
 * - Consider implementing both recursive and iterative
 * - Think about rotated sorted array variation
 */
public class BinarySearch {
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (arr[mid] == target) {
                return mid;
            }
            if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] sortedArray = {1, 3, 5, 7, 9, 11, 13, 15};
        int target = 7;
        int result = binarySearch(sortedArray, target);
        
        if (result != -1) {
            System.out.println("Element " + target + " found at index " + result);
        } else {
            System.out.println("Element " + target + " not found in array");
        }
    }
}
