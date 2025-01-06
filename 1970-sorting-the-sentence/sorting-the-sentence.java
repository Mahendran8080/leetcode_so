class Solution {
    public String sortSentence(String s) {
        s=s.trim();
        String[] str=s.split(" ");

        String[] res=new String[str.length];
        int i=0;
        StringBuilder sb=new StringBuilder();

        for(String val:str)
        {
            i=(int) (val.charAt(val.length()-1)-'0');
            res[i-1]=val.substring(0,val.length()-1);
        }

        for(i=0;i<res.length-1;i++)
        {
            sb.append(res[i]).append(" ");
        }
        sb.append(res[i]);

        return sb.toString();
        
    }
}