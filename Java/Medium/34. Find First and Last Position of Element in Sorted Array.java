class Solution {
    public int[] searchRange(int[] nums, int target) {
    int[] res=new int[2];
    int start=0,end=nums.length-1;
    res[0]=first(nums,start,end,target);
    res[1]=last(nums,start,end,target);
    return res;
    }

    public int first(int[] nums,int s,int e,int t){
        int res=-1;
        while(s<=e){
            int mid=(s+e)/2;
            if(nums[mid]==t){
                res=mid;
                e=mid-1;
            }
            else if(nums[mid]>t) e=mid-1;
            else s=mid+1;
        }
        return res;
    }
    public int last(int[] nums,int s,int e,int t){
        int res=-1;
        while(s<=e){
            int mid=(s+e)/2;
            if(nums[mid]==t){
                res=mid;
                s=mid+1;
            }
            else if(nums[mid]>t) e=mid-1;
            else s=mid+1;
        }
        return res;
    }
}
