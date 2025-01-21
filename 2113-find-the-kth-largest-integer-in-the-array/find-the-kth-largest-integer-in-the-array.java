import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public String kthLargestNumber(String[] nums, int k) {
        // Sort the array numerically using a custom comparator
        Arrays.sort(nums, (a, b) -> {
            if (a.length() != b.length()) {
                return Integer.compare(a.length(), b.length());
            }
            return a.compareTo(b);
        });
        
        // Return the kth largest number
        return nums[nums.length - k];
    }
}
