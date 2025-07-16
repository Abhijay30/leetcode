class Solution {
    public int findNumbers(int[] nums) {
        int res=0;
        for(int i=0;i<nums.length;i++){
                String n=String.valueOf(nums[i]);
                if(n.length()%2==0) res+=1;
                
            }
            return res;
        }
        
    }
