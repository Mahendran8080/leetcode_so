class Solution {
    public int[] sortArrayByParityII(int[] nums) {

       int[] even=new int[nums.length/2];
       int[] odd=new int[nums.length/2];

       int eIdx=0;
       int oIdx=0;

       for(int num:nums)
       {
        if(num%2==0)
        {
            even[eIdx++]=num;

        }
        else
        {
            odd[oIdx++]=num;
        }
       }
         eIdx=0;
        oIdx=0;
       

       for(int i=0;i<nums.length;i++)
       {
        if(i%2==0)
        {
            nums[i]=even[eIdx++];
        }
        else
        {
            nums[i]=odd[oIdx++];
        }
       } 
       return nums;
        
    }
}