package Leetcodes;

import java.util.*;

public class relativeSortArray {
    public static int[] relativeSortArray(int[] arr1, int[] arr2){
        //Creating a hashmap to store the frequency of elements
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : arr1){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        //Creating an array to store the result
        int[] result = new int[arr1.length];
        int index = 0; //keeping track of the index values

        //Putting values into the result
        for(int num : arr2){
            int count = map.get(num);
            while(count > 0){
                result[index++] = num;
                count--;
            }
            map.remove(num);
        }

        //Getting remaining values out in a list
        List<Integer> list = new ArrayList<>();
        for(int key : map.keySet()){
            int till = map.get(key);
            while(till > 0){
                list.add(key);
                till--;
            }
        }

        //Sorting the remaining(list) values
        Collections.sort(list);

        //Finally adding the remaining values into the result
        for(int num : list){
            result[index++] = num;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = {2,3,1,3,2,4,6,7,9,2,19};
        int[] arr2 = {2,1,4,3,9,6};
        int[] ans = relativeSortArray(arr1, arr2);
        System.out.println(Arrays.toString(ans));
    }
}

// CODE IN PYTHON IS MUCH SIMPLER AS COMPARED TO JAVA

/*

class Solution:
    def relativeSortArray(self, arr1: List[int], arr2: List[int]) -> List[int]:

        # Create a frequency map for arr1
        count = Counter(arr1)

        # Initialize the result list
        result = []

        # Place elements of arr2 in result as per their frequency in arr1
        for num in arr2:
            if num in count:
                result.extend([num] * count[num])
                del count[num]

        # Place remaining elements in result after sorting them
        remaining = sorted(count.elements())
        result.extend(remaining)

        return result

 */