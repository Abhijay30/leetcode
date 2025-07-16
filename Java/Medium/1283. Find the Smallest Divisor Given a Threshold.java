class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int res=0;
        int l=nums.length;
        int max=getmax(nums,l);
        int start=1,end=max;
        while(start<end){
            int mid=(start+end)/2;
            int sum=calc(nums,mid);
            if(sum>threshold) start=mid+1;
            else end=mid;

        }
        return start;
    }


    public int getmax(int[] nums,int l){
        int max=nums[0];
        for(int i=0;i<l;i++){
            if(nums[i]>max) max=nums[i];
        }
        return max;
    }

    public int calc(int[] nums,int n){
        int sum=0;
        for(int ele:nums){
            sum += (ele + n - 1) / n;
        }
        return sum;
    }
}
