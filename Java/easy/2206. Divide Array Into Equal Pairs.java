class Solution {
    public boolean divideArray(int[] nums) {
        int c=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i+=2){
            if(nums[i]==nums[i+1]) c+=1;
        }

        return c==nums.length/2;
    }

}
