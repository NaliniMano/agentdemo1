/**
 * Bubble Sort Implementation
 * 
 * Problem: Sort an array by repeatedly comparing adjacent elements
 * Example: [64, 34, 25, 12] → [12, 25, 34, 64]
 * 
 * Approach:
 * 1. Compare adjacent elements
 * 2. Swap if they are in wrong order
 * 3. Repeat for each element
 * 4. After each iteration, largest element bubbles up to end
 * 
 * Time Complexity:
 * - Best Case: O(n) - already sorted
 * - Average Case: O(n^2)
 * - Worst Case: O(n^2) - reverse sorted
 * 
 * Space Complexity: O(1) - in-place sorting
 * 
 * Note: Not efficient for large datasets
 * Better alternatives: QuickSort, MergeSort, HeapSort
 */
public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap elements
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("Original array:");
        printArray(arr);
        
        bubbleSort(arr);
        
        System.out.println("Sorted array:");
        printArray(arr);
    }
}
