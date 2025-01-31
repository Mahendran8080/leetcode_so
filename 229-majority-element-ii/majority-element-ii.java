import java.util.*;

class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();

        int n=nums.length;

       for (int item : nums)
        {
          map.put(item, map.getOrDefault(item, 0) + 1);
        }
        List<Integer> li=new ArrayList<>();

        for(Map.Entry<Integer,Integer> entry: map.entrySet())
        {
          if(entry.getValue()>n/3)
          {
            li.add(entry.getKey());
          }

        }
        return li;

        
        
    }
}