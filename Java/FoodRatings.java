package Leetcodes;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//class FoodRatings {
//        String[] foods;
//        String[] cuisines;
//        int[] ratings;
//    public FoodRatings(String[] foods, String[] cuisines, int[] ratings) {
//        this.foods=foods;
//        this.ratings=ratings;
//        this.cuisines=cuisines;
//    }
//
//    public void changeRating(String food, int newRating) {
//        int index =  Arrays.asList(foods).indexOf(food);
//        ratings[index] = newRating;
//    }
//
//    public String highestRated(String cuisine) {
//        int maxRating = 0;
//        String highestRatedFood = "";
//        for(int i=0; i<cuisines.length; i++){
//            if(cuisines[i].equals(cuisine) && ratings[i] >= maxRating){
//                if(ratings[i] > maxRating || (ratings[i] == maxRating && foods[i].compareTo(highestRatedFood) < 0)){
//                    maxRating = ratings[i];
//                    highestRatedFood = foods[i];
//                }
//            }
//        }
//        return highestRatedFood;
//    }
//
//    public static void main(String[] args) {
//        String[] foods = {"kimchi", "miso", "sushi", "moussaka", "ramen", "bulgogi"};
//        String[] cuisines = {"korean", "japanese", "japanese", "greek", "japanese", "korean"};
//        int[] ratings = {9, 12, 8, 15, 14, 7};
//
//        // Initialize the FoodRatings system
//        FoodRatings foodRatings = new FoodRatings(foods, cuisines, ratings);
//
//        // Find the highest-rated food for a given cuisine
//        String result1 = foodRatings.highestRated("korean");
//        System.out.println(result1);  // Output: kimchi
//
//        String result2 = foodRatings.highestRated("japanese");
//        System.out.println(result2);  // Output: ramen
//
//        // Change the rating of a food item
//        foodRatings.changeRating("sushi", 16);
//
//        // Find the highest-rated food again
//        String result3 = foodRatings.highestRated("japanese");
//        System.out.println(result3);  // Output: sushi
//
//        // Change the rating of another food item
//        foodRatings.changeRating("ramen", 16);
//
//        // Find the highest-rated food once more
//        String result4 = foodRatings.highestRated("japanese");
//        System.out.println(result4);  // Output: ramen
//    }
//}

/**
 * Your FoodRatings object will be instantiated and called as such:
 * FoodRatings obj = new FoodRatings(foods, cuisines, ratings);
 * obj.changeRating(food,newRating);
 * String param_2 = obj.highestRated(cuisine);
 */

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class FoodRatings {
    String[] foods;
    String[] cuisines;
    int[] ratings;
    Map<String, String> highestRatedMap; // Map to store the highest-rated food for each cuisine

    public FoodRatings(String[] foods, String[] cuisines, int[] ratings) {
        this.foods = foods;
        this.ratings = ratings;
        this.cuisines = cuisines;
        this.highestRatedMap = new HashMap<>();

        // Initialize the highest-rated map
        for (int i = 0; i < cuisines.length; i++) {
            if (!highestRatedMap.containsKey(cuisines[i]) || ratings[i] > ratings[Arrays.asList(foods).indexOf(highestRatedMap.get(cuisines[i]))]) {
                highestRatedMap.put(cuisines[i], foods[i]);
            } else if (ratings[i] == ratings[Arrays.asList(foods).indexOf(highestRatedMap.get(cuisines[i]))] && foods[i].compareTo(highestRatedMap.get(cuisines[i])) < 0) {
                highestRatedMap.put(cuisines[i], foods[i]);
            }

        }
    }

    public void changeRating(String food, int newRating) {
        int index = Arrays.asList(foods).indexOf(food);
        ratings[index] = newRating;

        // Update the highest-rated map if needed
        if (!highestRatedMap.containsKey(cuisines[index]) || newRating > ratings[Arrays.asList(foods).indexOf(highestRatedMap.get(cuisines[index]))]) {
            highestRatedMap.put(cuisines[index], food);
        } else if (newRating == ratings[Arrays.asList(foods).indexOf(highestRatedMap.get(cuisines[index]))] && food.compareTo(highestRatedMap.get(cuisines[index])) < 0) {
            highestRatedMap.put(cuisines[index], food);
        }
    }

    public String highestRated(String cuisine) {
        return highestRatedMap.get(cuisine);
    }

    public static void main(String[] args) {
        String[] foods = {"kimchi", "miso", "sushi", "moussaka", "ramen", "bulgogi"};
        String[] cuisines = {"korean", "japanese", "japanese", "greek", "japanese", "korean"};
        int[] ratings = {9, 12, 8, 15, 14, 7};

        // Initialize the FoodRatings system
        FoodRatings foodRatings = new FoodRatings(foods, cuisines, ratings);

        // Find the highest-rated food for a given cuisine
        String result1 = foodRatings.highestRated("korean");
        System.out.println(result1);  // Output: kimchi

        String result2 = foodRatings.highestRated("japanese");
        System.out.println(result2);  // Output: ramen

        // Change the rating of a food item
        foodRatings.changeRating("sushi", 16);

        // Find the highest-rated food again
        String result3 = foodRatings.highestRated("japanese");
        System.out.println(result3);  // Output: sushi

        // Change the rating of another food item
        foodRatings.changeRating("ramen", 16);

        // Find the highest-rated food once more
        String result4 = foodRatings.highestRated("japanese");
        System.out.println(result4);  // Output: ramen
    }
}
