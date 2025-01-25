class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {

        String[] st=sentence.split(" ");

        for(int i=0;i<st.length;i++)
        {
            for(int j=0;j<dictionary.size();j++)
            {
                if(st[i].startsWith(dictionary.get(j)))
                {
                    st[i]=dictionary.get(j);
                }
            }
        }
        StringBuilder sb=new StringBuilder();

        for(int i=0;i<st.length-1;i++)
        {
            sb.append(st[i]);
            sb.append(" ");

        }
        sb.append(st[st.length-1]);

        return sb.toString();





        
        
    }
}