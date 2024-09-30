/**
 * The TimeConverter class gets the current time of the search query, formats it to a human readable format, and 
 * returns it back to the SearchMemory - storeSearch function that calls it
 * 
 */

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class TimeConverter {

    public static String getTime() {
        long currentTimeMillis = System.currentTimeMillis();

        // Create an Instant
        Instant instant = Instant.ofEpochMilli(currentTimeMillis);

        // Convert Instant to LocalDateTime
        LocalDateTime localDateTime = LocalDateTime.ofInstant(instant, ZoneId.of("UTC"));

        // specify format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        // Formatting the LocalDateTime object using the specified format
        String formattedDate = localDateTime.format(formatter);
      
        return formattedDate;
    }

}
