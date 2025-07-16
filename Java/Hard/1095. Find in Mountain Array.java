/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int start=0,end=mountainArr.length()-1;
        int highest=highest(start,end,mountainArr);
        int b1=bs_ass(mountainArr,start,highest,target);
        int b2= bs_dec(mountainArr,highest,end,target);
        if(b1!=-1 && b2 !=-1){
        if(b1 < b2 ) return b1;
        else return b2;}
        else if(b1!=-1) return b1;
        else return b2;
       
    }

    public int highest(int start,int end,MountainArray arr){
         while(start<end){
            int mid=(start+end)/2;
            if(arr.get(mid)>arr.get(mid+1)) end=mid; 
            else start=mid+1;
        }
        return start;
    }
    public int bs_ass(MountainArray arr,int start,int end,int target){
        while(start<=end){
            int mid=(start+end)/2;
            if(arr.get(mid)==target) return mid; 
            else if(arr.get(mid)>target) end=mid-1;
            else start=mid+1;
        }
        return -1;
    }
    public int bs_dec(MountainArray arr,int start,int end,int target){
        while(start<=end){
            int mid=(start+end)/2;
            if(arr.get(mid)==target) return mid; 
            else if(arr.get(mid)<target) end=mid-1;
            else start=mid+1;
        }
        return -1;
    }
}
