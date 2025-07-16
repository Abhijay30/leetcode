class Solution {
    public int maximumCount(int[] nums) {
        int pos=0,neg=0;

        for(int ele:nums){
            if(ele>0) pos+=1;
            if(ele<0) neg+=1;
        }
        return (int)(Math.max(pos,neg));
    }
}
