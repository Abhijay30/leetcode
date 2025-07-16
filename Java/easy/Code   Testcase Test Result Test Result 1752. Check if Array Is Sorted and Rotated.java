class Solution {
    public boolean check(int[] nums) {
        if(check(nums,0,nums.length-1)) return true;
        if(nums[nums.length - 1] > nums[0]) return false;
        int breakpoint=breakpoint(nums);
        boolean left=check(nums,0,breakpoint-1);
        boolean right=check(nums,breakpoint,nums.length-1);
        return left && right;
    }

    public int breakpoint(int[] nums){
        int first=nums[0];
        int start=0,end=nums.length-2;
        while(start<=end){
            int mid=(start+end)/2;
            if(nums[mid]>nums[mid+1]) return mid+1;
            else if(nums[mid]<first) end=mid-1;
            else start=mid+1;
        }
        return 0;
    }

    public boolean check(int[] nums,int start,int end){
        for(int i=start;i<end;i++){
            if(nums[i+1]<nums[i]) return false;
        }
        return true;
    }
}
