class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {

        Map<String,Integer> map=new HashMap<>();

        String[] str1=s1.split(" ");
        String[] str2=s2.split(" ");

        for(String str:str1)
        {
            map.put(str, map.getOrDefault(str, 0) + 1);
        }
        for(String str:str2)
        {
           map.put(str,map.getOrDefault(str,0)+1);

        }

        List<String> list=new ArrayList<>();
        for(String str:map.keySet())
        {
            if(map.get(str)==1)
            {
                list.add(str);
            }

        }

        String[] res=new String[list.size()];
        int idx=0;

        for(String str:list)
        {
            res[idx++]=str;
        } 
        return res;       
    }
}