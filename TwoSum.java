import java.util.HashMap;
import java.util.Arrays;

/**
 * Problem: Two Sum (LeetCode #1)
 * Approach: Optimal HashMap (One-Pass)
 * Time Complexity: O(N) - We traverse the array only once.
 * Space Complexity: O(N) - To store elements and their indices in the HashMap.
 */
public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            // Calculate the number needed to reach the target
            int complement = target - nums[i];
            
            // Check if the complement already exists in the map
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            
            // Store the current number and its index for future lookups
            map.put(nums[i], i);
        }
        
        return new int[] {}; // Return empty array if no solution is found
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        System.out.println("Indices: " + Arrays.toString(twoSum(nums, target)));
    }
}