class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i] - 1;
            if (nums[i] != nums[correct]) swap(nums, i, correct);
            else i++;
        }
        for (int j = 0; j < nums.length; j++) {
            if (j + 1 != nums[j]) ans.add(j + 1);
        }
        return ans;
    }
    public void swap(int[] nums, int fake, int correct) {
            int temp = nums[fake];
            nums[fake] = nums[correct];
            nums[correct] = temp;
        }
}
