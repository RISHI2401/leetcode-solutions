package Leetcodes;

public class numberOfBeams {
    public static int numberOfBeams(String[] bank){
        int previousCount = 0;
        int total = 0;

        for(String row:bank){
            int currentCount = calc(row);
            if(currentCount == 0){
                continue;
            }
            total += currentCount * previousCount;
            previousCount = currentCount;
        }
        return total;
    }
    private static int calc(String row){
        int count=0;
        for(char c : row.toCharArray()){
//            if(c=='1'){
//                count++;
//            }
            count += c -'0'; // 49-48  unicode values (0 -> 48 && 1 -> 49)
        }
        return count;
    }

    public static void main(String[] args) {
        String[] bank = {"011001","000000","010100","001000"};
        System.out.println(numberOfBeams(bank));
    }
}
