class Solution {
    public int findFinalValue(int[] nums, int original) {

        int found=original;

        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==found)
            {
                found=nums[i]*2;
                i=-1;
            }
        }
        return found;
        
    }
}