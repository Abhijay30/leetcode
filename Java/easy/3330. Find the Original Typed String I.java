class Solution {
    public int possibleStringCount(String word) {
        int t=0;
        
        for(int i=0;i<word.length()-1;i++){
            int c=0;
            if(word.charAt(i) == word.charAt(i+1)){
                for(int j=i+1;j<word.length();j++){
                    if(word.charAt(i)==word.charAt(j))
                    {
                     c=c+1;
                    break;}
                    }
                }
            t=t+c;
        }
        return t+1;
    }
}
