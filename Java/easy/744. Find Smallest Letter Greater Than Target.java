class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int start=0,end=letters.length-1;
        if(letters[letters.length-1]<=target) return letters[0];
        while(start<end){
            int mid=(start+end)/2;
            if(letters[mid]>target) end=mid;
            else start=mid+1;
        }
        return letters[end];
    }
}
