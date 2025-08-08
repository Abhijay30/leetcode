class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;

        char[] as=new char[s.length()];
        char[] at=new char[t.length()];

        for(int i=0;i<s.length();i++){
            as[i]=s.charAt(i);
            at[i]=t.charAt(i);
        }

        Arrays.sort(as);
        Arrays.sort(at);


        for(int i=0;i<t.length();i++){
            if(as[i]!=at[i]) return false;
        }

        return true;
    }
}
