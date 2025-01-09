class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer,Integer> map=new HashMap<>();

        for(int num:nums)
        {
            map.put(num,map.getOrDefault(num,0)+1);
        }

        int[] arr=new int[map.size()];
        int idx=0;

        for(Map.Entry<Integer,Integer> entry:map.entrySet())
        {
            arr[idx++]=entry.getValue();
        }

        Arrays.sort(arr);

    List<Integer> list=new ArrayList<>();
    int i=arr.length-1;

    while(k>0)
    {
        list.add(arr[i]);
        k--;
        i--;

    }

    int[] res=new int[list.size()];

    int idx1=0;
    int y=0;

      for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (list.contains(entry.getValue())) { // Check if the frequency is in the top-k list
                res[idx1++] = entry.getKey();
                
            }
        }

     return res;


        
    }
}