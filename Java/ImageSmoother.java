package Leetcodes;

public class ImageSmoother {
    public static int[][] imageSmoother(int[][] img) {
        int rows = img.length;
        int cols = img[0].length;
        int[][] ans = new int[rows][cols];

        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                ans[i][j] = smoothen(img, i, j);
            }
        }
        return ans;
    }
    static int smoothen(int[][] img, int i, int j){
        int sum = 0;
        int count = 0;
        //for smoothing window
        for(int x = i - 1; x <= i + 1; x++){
            for(int y = j - 1; y <= j + 1; y++){
                if(x >= 0 && x < img.length && y >= 0 && y < img[0].length){
                    sum += img[x][y];
                    count++;
                }
            }
        }
        return sum/count;
    }

    public static void main(String[] args) {
        int[][] img = {{100, 200, 100}, {200, 50, 200}, {100, 200, 100}};
        int[][] result = imageSmoother(img);

        // Print the result
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
