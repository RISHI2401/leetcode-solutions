package Leetcodes;

public class minFallingPathSum {
    public static int minFallingPathSum(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] mat = new int[rows][cols];

       for(int col = 0 ; col<cols; col++){
           mat[0][col] = matrix[0][col];
       }
       //Iterating through the matrix
        for(int row=1; row<rows; row++){
            for(int col=0; col<cols; col++){
                mat[row][col] = matrix[row][col] + Math.min(mat[row-1][col], Math.min(col>0 ? mat[row-1][col-1] : Integer.MAX_VALUE, col<cols-1 ? mat[row-1][col+1] : Integer.MAX_VALUE));
            }
        }
        int minPathSum = Integer.MAX_VALUE;
        for(int col=0; col<cols; col++){
            minPathSum = Math.min(minPathSum, mat[rows-1][col]);
        }
        return minPathSum;
    }

    public static void main(String[] args) {
        int[][] matrix = {{2,1,3},{6,5,4},{7,8,9}};
        System.out.println(minFallingPathSum(matrix));
    }
}
