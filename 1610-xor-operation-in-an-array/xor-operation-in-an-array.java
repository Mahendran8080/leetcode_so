class Solution {
    public int xorOperation(int n, int start) {

        int[] arr=new int[n];
        int idx=0;

        for(int i=0;i<n;i++)
        {
            arr[idx++]=start+2*i;
        }
        int xor=arr[0];

        for(int i=1;i<n;i++)
        {
            xor=xor^arr[i];
        }
        return xor;
        
    }
}