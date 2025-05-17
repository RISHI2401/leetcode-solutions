package Leetcodes;

public class specialPositionBinaryMatrix {
    public static int numSpecial(int[][] mat) {
        int count = 0;
        int[] rowSum = new int[mat.length];
        int[] columnSum = new int[mat[0].length]; //no of columns aka elements in first row
        for(int i=0; i< mat.length; i++){
            for(int j=0; j< mat.length; j++){
                rowSum[i] += mat[i][j];
                columnSum[j] += mat[i][j];
            }
        }
        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat[0].length; j++){
                if(mat[i][j] == 1 && rowSum[i] == 1 && columnSum[j] == 1){
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[][] mat =  {{1, 0, 0}, {0, 0, 1}, {1, 0, 0}};
        System.out.println(numSpecial(mat));
    }
}
