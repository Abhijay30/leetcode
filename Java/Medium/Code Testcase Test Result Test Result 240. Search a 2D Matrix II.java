class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int c=matrix[0].length-1,r=0;
        while(r<matrix.length && c>=0){
            if(target==matrix[r][c]) return true;
            else if(target<matrix[r][c]) c--;
            else if(target>matrix[r][c]) r++;
        }
        return false;
    }
}
