package strings;

/**
 * Problem: Valid Palindrome (LeetCode #125)
 * Approach: Two-Pointer Approach
 * Time Complexity: O(N) - Single pass through the string.
 * Space Complexity: O(1) - Constant extra space.
 */
public class ValidPalindrome {
    public static boolean isPalindrome(String s) {
        if (s == null || s.isEmpty()) {
            return true;
        }
        
        int left = 0;
        int right = s.length() - 1;
        
        while (left < right) {
            char currLeft = s.charAt(left);
            char currRight = s.charAt(right);
            
            // Check if left character is not alphanumeric, move left forward
            if (!Character.isLetterOrDigit(currLeft)) {
                left++;
            } 
            // Check if right character is not alphanumeric, move right backward
            else if (!Character.isLetterOrDigit(currRight)) {
                right--;
            } 
            // Compare both characters in lowercase
            else {
                if (Character.toLowerCase(currLeft) != Character.toLowerCase(currRight)) {
                    return false;
                }
                left++;
                right--;
            }
        }
        
        return true;
    }

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println("Is Palindrome? " + isPalindrome(s)); // Output: true
    }
}