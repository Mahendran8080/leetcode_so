class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {

        Map<String,Integer> map=new HashMap<>();
        List<String> li=new ArrayList<>();
        int min=Integer.MAX_VALUE;

        for(int i=0;i<list1.length;i++)
        {
            map.put(list1[i],i);
        }
        for(int j=0;j<list2.length;j++)
        {
            if(map.containsKey(list2[j]))
            {
                int sum=j+map.get(list2[j]);

                if(sum<min)
                {
                    min=sum;
                    li.clear();
                    li.add(list2[j]);
                }
                else if(sum==min)
                {
                    li.add(list2[j]);
                }
            }
        }
        return li.toArray(new String[0]);
        
    }
}