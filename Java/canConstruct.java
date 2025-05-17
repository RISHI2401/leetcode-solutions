package Leetcodes;
import java.util.HashMap;
import java.util.Map;

public class canConstruct {
    public static boolean canConstruct(String magazine, String ransomeNote){
        Map<Character, Integer> map = new HashMap<>();
        for(Character c : magazine.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for(Character c : ransomeNote.toCharArray()){
            if(map.containsKey(c) && map.get(c) > 0){
                map.put(c, map.get(c)-1);
            }else{
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String magazine = "aab";
        String ransomeNote = "aa";
        System.out.println(canConstruct(magazine, ransomeNote));
    }
}
