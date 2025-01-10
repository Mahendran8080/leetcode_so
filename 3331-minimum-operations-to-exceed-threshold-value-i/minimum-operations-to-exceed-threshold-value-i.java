class Solution {
    public int minOperations(int[] nums, int k) {

        int step=0;

        for(int num:nums)
        {
            if(num<k)
            {
                step++;
            }
        }

        return step;
        
    }
}