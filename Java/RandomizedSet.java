package Leetcodes;

import java.util.*;

public class RandomizedSet {
    private Set<Integer> set;
    Random random;
    public RandomizedSet() {
        set = new HashSet<>();
        random = new Random();
    }

    public boolean insert(int val) {
        if(!set.contains(val)){
            set.add(val);
            return true;
        }
        return false;
    }

    public boolean remove(int val) {
        if(set.contains(val)){
            set.remove(val);
            return true;
        }
        return false;
    }

    public int getRandom() {
        List<Integer> list = new ArrayList<>(set);
        return list.get(random.nextInt(list.size()));

    }

    public static void main(String[] args) {
         RandomizedSet obj = new RandomizedSet();
         boolean param_1 = obj.insert(1);
         boolean param_2 = obj.remove(2);
         int param_3 = obj.getRandom();
    }
}
