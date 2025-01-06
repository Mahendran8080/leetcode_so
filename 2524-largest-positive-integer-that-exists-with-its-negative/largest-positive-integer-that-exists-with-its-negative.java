class Solution {

    public int function(int[] nums,int val)
    {
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==val)
            {
                return nums[i];
            }
        }
        return 0;
    }
    public int findMaxK(int[] nums) {
        Arrays.sort(nums);

        for(int i=0;i<nums.length;i++)
        {
            int val=nums[i]*-1;
            int res=function(nums,val);

            if(res!=0)
            {
                return res;
            }
        }
        return -1;

        

        
    }
}