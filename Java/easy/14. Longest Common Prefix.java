class Solution {
    public String longestCommonPrefix(String[] strs) {

        if(strs.length==1) return strs[0];
        String len="";
        int min = strs[0].length();
        for (int i = 1; i < strs.length; i++) {
            if (strs[i].length() < min) {
                min = strs[i].length();
            }
        }
        for(int i=0;i<min;i++){
            boolean t=true;
            char c=strs[0].charAt(i);
                for(int j=1;j<strs.length;j++){
                    if(strs[j].charAt(i)!=c){
                        t=false;}
                }
                if(t) len+=c;
                else break;
                }

            
        return len;
    }
}
