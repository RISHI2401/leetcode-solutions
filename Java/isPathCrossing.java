package Leetcodes;

import java.util.HashSet;
import java.util.Set;

public class isPathCrossing {
    public static boolean isPathCrossing(String path) {
        Set<String> visited = new HashSet<>();
        visited.add("0,0");
        int x = 0, y = 0;
        for(char direction : path.toCharArray()){
            switch (direction){
                case'N':
                    y++;
                    break;
                case'S':
                    y--;
                    break;
                case 'E':
                    x++;
                    break;
                case 'W':
                    x--;
                    break;
                default:
                    break;
            }
            String currentPosition = getCurrentPosition(x,y);
            if(visited.contains(currentPosition)){
                return true;
            }
            visited.add(currentPosition);
        }
        return false;
    }
    public static String getCurrentPosition(int x, int y) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(x);
        stringBuilder.append(",");
        stringBuilder.append(y);
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        System.out.println(isPathCrossing("NESWW"));
    }

}
