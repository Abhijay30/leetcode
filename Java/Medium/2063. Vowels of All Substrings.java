class Solution {
    public long countVowels(String word) {
        long c=0;
        ArrayList<String> subs= new ArrayList<>();

        for(int i=0;i<word.length();i++){
            if(iseven(word.charAt(i))){
                c+=(long)(i+1)*(word.length()-i);
            }
        }
        return c;
    }

    public boolean iseven(char ch){
         if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    return true;
                }
        return false;
    }
}
