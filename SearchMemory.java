/**
 * The SearchMemory class is called from a for loop in the Driver class to print out the search terms, their search frequencies,
 * and timestamps. A HashMap is used for the terms and counts, and an ArrayList is used for the timestamps
 * The TimeConverter class is also called here to get the timestamps in the right format
 */

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;

public class SearchMemory {
    public static Map<String, Integer> searchCount;
    public static List<String> searchTime;

    public SearchMemory() {
        searchCount = new HashMap<>();
        searchTime = new ArrayList<>();
    }

    public static void storeSearch(String searchTerm) {
        // Increment search count
        searchCount.put(searchTerm, searchCount.getOrDefault(searchTerm, 0) + 1);

        // Record timestam and add to arrayList
        String timestamp = TimeConverter.getTime();
        searchTime.add(timestamp);

        //print results
        System.out.println("Search term: " + searchTerm + ", Count: " + searchCount.get(searchTerm) + ", Timestamp: " + timestamp);
    }

   
}