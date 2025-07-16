class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row_length=matrix.length;
        int col_length=matrix[0].length;
        int c=col_length-1;
        int r=0;
        while(r<row_length && c>=0){
            if(target==matrix[r][c]) return true;
            else if(target<matrix[r][c]) c--;
            else if(target>matrix[r][c]) r++;
        }
        return false;
    }
}
