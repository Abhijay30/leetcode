class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> res=new ArrayList<Integer>();
        for(int i=0;i<nums1.length;i++){
            if(bs(nums2,nums1[i])) res.add(nums1[i]);
        }

        int i = 0;
        int[] result = new int[res.size()];
        for (Integer num : res) {
            result[i++] = num;
        }
        
        Arrays.sort(result);
        int[] temp = new int[result.length];
        int j = 0;

        for (int k = 0; k < result.length; k++) {
            if (k == 0 || result[k] != result[k - 1]) {
                temp[j++] = result[k];
            }
        }

        int[] resu = Arrays.copyOf(temp, j);
        return resu;
    }

    public boolean bs(int[] nums,int target){
        Arrays.sort(nums);
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]==target) return true;
            else if(nums[mid]>target) end=mid-1;
            else start=mid+1;
        }
        return false;
    }
}
