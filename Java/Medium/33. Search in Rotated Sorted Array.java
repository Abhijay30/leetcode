class Solution {
    public int search(int[] nums, int target) {
        int end=kval(nums,0,nums.length-1);
        int res=-1;
        if(end==0) res=bs(nums,0,nums.length-1,target);

        else if(target<nums[0]) res=bs(nums,end,nums.length-1,target);

        else res=bs(nums,0,end-1,target);

        return res;
    }

    public int kval(int[] nums,int start,int end){
        int first=nums[0];
        if (nums[start] <= nums[end]) return 0;
        while(start<=end){
            int mid=(start+end)/2;
            if(mid < nums.length - 1 && nums[mid]>nums[mid+1]) return mid+1;
            else if(nums[mid]<first) end=mid-1;
            else start=mid+1;
        }
        return 0;
    }

    public int bs(int[] nums,int start,int end,int target){
        while(start<=end){
            int mid=(start+end)/2;
            if(nums[mid]==target) return mid;
            else if(nums[mid]>target) end=mid-1;
            else start=mid+1;
        }
        return -1;
    }
}
