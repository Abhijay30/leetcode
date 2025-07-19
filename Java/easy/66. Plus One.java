class Solution {
    public int[] plusOne(int[] digits) {
        int i=digits.length-1;
        while (i>=0) {
            if (digits[i] + 1 != 10) {
                digits[i] += 1;
                return digits;
            }
            digits[i] = 0;
            i--;
        }
        
        int[] ad = new int[digits.length + 1];
        ad[0] = 1;
        return ad;        
    }
}
