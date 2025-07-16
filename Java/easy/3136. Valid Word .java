class Solution {
    public boolean isValid(String word) {
        if(word.length()<3) return false;
        boolean vowel=false,conso=false,capvowel=false;
        int conditions=0;

        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            if(Character.isLetter(ch)){
                ch=Character.toLowerCase(ch);
                if (ch == 'a' ||ch == 'e' || ch == 'i' ||ch == 'o' ||  ch == 'u') vowel=true;
                else conso=true;
            }
            else if(!Character.isDigit(ch)) return false;
        }
        return (vowel && conso );}
}
