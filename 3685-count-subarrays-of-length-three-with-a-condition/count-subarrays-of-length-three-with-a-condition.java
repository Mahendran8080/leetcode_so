class Solution {
    public int countSubarrays(int[] nums) {

        int n=nums.length;

        int count=0;
        
        for(int i=0;i<n-3+1;i++)
        {
            for(int j=0;j<3;j++)
            {
                int sum=2*(nums[i+j] + nums[i+j+2]);
                if(sum== nums[i+j+1])
                {
                    count++;
                }

                break;
            }
        }

        return count;
        
    }
}