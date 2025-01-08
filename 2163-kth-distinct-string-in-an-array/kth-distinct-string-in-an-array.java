class Solution {
    public String kthDistinct(String[] arr, int k) {

        Map<String,Integer> map=new HashMap<>();

        for(String str:arr)
        {
            map.put(str,map.getOrDefault(str,0)+1);


        }

        List<String> list=new ArrayList<>();

        for(String val:arr)
        {
            if(map.get(val)==1)
            {
                list.add(val);

            }
        }

        if(k>0&& k<=list.size())
        {
        return list.get(k-1);
        }
        return "";


        
    }
}