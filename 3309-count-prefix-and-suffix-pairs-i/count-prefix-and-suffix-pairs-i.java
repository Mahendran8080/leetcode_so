class Solution {

    public boolean isPrefixAndSuffix(String str1,String str2)
    {
        boolean isPrefix=str2.startsWith(str1);
        boolean isSuffix=str2.endsWith(str1);

        if(isPrefix && isSuffix)
        {
            return true;
        }
        return false;
        
    }
    public int countPrefixSuffixPairs(String[] words) {

        int count=0;

        for(int i=0;i<words.length;i++)
        {
            for(int j=i+1;j<words.length;j++)
            {
                boolean val=isPrefixAndSuffix(words[i],words[j]);

                if(val)
                {
                    count++;
                }
            }
        }
        return count;
        
    }
}