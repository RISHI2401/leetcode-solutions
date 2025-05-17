package Leetcodes;
import java.util.*;
public class destinationCity {
    public static String destCity(List<List<String>> paths) {
        Set<String> sourceCities = new HashSet<>();
        Set<String> destinationCities = new HashSet<>();

        for(List<String> path : paths){
            String source = path.get(0);
            String destination = path.get(1);
            sourceCities.add(source);
            destinationCities.add(destination);
        }

        for(String destination : destinationCities){
            if(!sourceCities.contains(destination)){
                return destination;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        List<List<String>> paths = new ArrayList<>();

        // Adding sublists to the main list
        paths.add(List.of("London", "New York"));
        paths.add(List.of("New York", "Lima"));
        paths.add(List.of("Lima", "Sao Paulo"));

        System.out.println(destCity(paths));
    }
}
