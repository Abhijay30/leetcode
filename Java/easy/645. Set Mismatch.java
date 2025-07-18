class Solution {
    public int[] findErrorNums(int[] nums) {
        int j=0;
        while(j<nums.length){
            int correct=nums[j]-1;
            if(nums[j]!=nums[correct]) swap(nums,j,correct);
            else j++;
        }
        int i=0;
        while(i<nums.length){
            if(i+1!=nums[i]) return new int[]{nums[i],i+1};
            else i++;
        }
        return new int[]{-1,-1};
    }
    void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
