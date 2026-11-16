import java.util.Arrays;

/**
 * Problem: Two Sum II - Input Array Is Sorted (LeetCode #167)
 * Approach: Two-Pointer Approach
 * Time Complexity: O(N) - Linear scan using left and right pointers.
 * Space Complexity: O(1) - Constant extra space.
 */
public class TwoSumII {
    public static int[] twoSum(int[] numbers, int target) {
        // Initialize two pointers: left at the beginning, right at the end
        int left = 0;
        int right = numbers.length - 1;
        
        while (left < right) {
            int sum = numbers[left] + numbers[right];
            
            // Check if the current sum matches the target
            if (sum == target) {
                // Return 1-indexed positions as required by the problem
                return new int[] { left + 1, right + 1 };
            } else if (sum < target) {
                // If sum is too small, move the left pointer to the right to increase the sum
                left++;
            } else {
                // If sum is too large, move the right pointer to the left to decrease the sum
                right--;
            }
        }
        
        return new int[] {}; // Return empty array if no solution is found
    }

    public static void main(String[] args) {
        int[] numbers = {2, 7, 11, 15};
        int target = 9;
        System.out.println("Indices: " + Arrays.toString(twoSum(numbers, target)));
    }
}