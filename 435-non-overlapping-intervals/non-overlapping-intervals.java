import java.util.*;

class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        // Step 1: Sort intervals by their ending times
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[1], b[1]));

        int count = 0; // Count of non-overlapping intervals
        int prevEnd = Integer.MIN_VALUE; // Track the end of the last non-overlapping interval

        // Step 2: Traverse intervals
        for (int[] interval : intervals) {
            if (interval[0] >= prevEnd) {
                // No overlap
                prevEnd = interval[1]; // Update the previous end
            } else {
                // Overlap found
                count++;
            }
        }

        return count; // Return the number of intervals to remove
    }
}
