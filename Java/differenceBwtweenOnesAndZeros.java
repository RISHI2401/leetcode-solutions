package Leetcodes;

public class differenceBwtweenOnesAndZeros {
    public static int[][] onesMinusZeros(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;

        int[] onesRow = new int[rows];
        int[] onesCol = new int[cols];

        int[][] diff = new int[rows][cols];

        for(int i=0; i< rows; i++){
            for(int j=0; j<cols; j++){
                if(grid[i][j]==1){
                    onesRow[i]++;
                    onesCol[j]++;
                }
                diff[i][j] = onesRow[i] + onesCol[j] - (grid.length - onesRow[i]) - (grid[0].length - onesCol[j]);
            }
        }
        return diff;
    }

    public static void main(String[] args) {
        int[][] grid = {{0,1,1},{1,0,1},{0,0,1}};
        System.out.println(onesMinusZeros(grid));

    }
}
