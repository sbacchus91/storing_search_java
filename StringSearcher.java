/**
 * The StringSearcher class consists of a method to look through the now consolidated and deduped file
 * and search for a user prompted input string, stopping at the first instance of the string being found
 *the row number and row contents are printed if found
 * 
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class StringSearcher {


    public static void searchFile(String inputFile, String userInputSearch) {
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile))) {
            String row;
            boolean found = false;
            int rowNumber = 0;

            //loop through each row
            while ((row = reader.readLine()) != null) {
                rowNumber++;

                // Check if the current row contains the search string
                if (row.contains(userInputSearch)) {
                    found = true;
                    System.out.println("");
                    System.out.println("We found the word " + userInputSearch + " in row " + rowNumber + ":");
                    System.out.println("");
                    System.out.println("This is the entire row where this string was found:");
                    System.out.println("");
                    System.out.println(row);
                    break;  //stop at first occurrence if string is found
                }
            }

            if (!found) {
                System.out.println("'" + userInputSearch + "' not found in the final merged file.");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}