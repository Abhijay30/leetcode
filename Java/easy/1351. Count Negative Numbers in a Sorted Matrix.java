class Solution {
    public int countNegatives(int[][] grid) {
        int row=0;
        int col=grid[0].length-1;
        int c=0;
        while(row<grid.length && col>=0){
            if(grid[row][col]>=0) row++;
            else {
                c+=grid.length-row;
                col--;
            }
        }

        return c;
    }
}
