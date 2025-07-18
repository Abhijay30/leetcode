class Solution {
    public int findDuplicate(int[] nums) {
        int i=0;
        while (i<nums.length){
            int correct=nums[i]-1;
            if(nums[i]!=nums[correct]) swap(nums,i,correct);
            else i++;
        }
        for(int j=0;j<nums.length;j++){
            if(j+1!=nums[j]) return nums[j];
        }
        return 0;
    }

    public void swap(int[] nums,int fake,int correct){
        int temp=nums[fake];
        nums[fake]=nums[correct];
        nums[correct]=temp;
    }
}
