/**

 * this is the driver class where the main method runs methods the SearchMemory, TimeConverter, and StringSearcher classes
 * to fulfill the assignments requirements
 * 
 */

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class Driver {
    public static void main(String[] args) {

        //decline array to store user inputs for method calls
        ArrayList<String> terms = new ArrayList<String>();

        //scanner for user input
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a search term (type 'exit' to stop): ");
            String searchTerm = scanner.nextLine().trim();

            // Check if the user wants to exit
            if (searchTerm.equalsIgnoreCase("exit")) {
                break;
            }

        //add searches to list
        terms.add(searchTerm);

        }
    
        // Close the scanner
        scanner.close();

        //use HashSet to get unique search terms in list to get accurate number of terms searched for
        Set<String> uniqueTerms = new HashSet<>(terms);


        //print number of search terms
        System.out.println("--------------------------------------------------");
        System.out.println("This is the number of unique terms you've searched for: ");
        System.out.println(uniqueTerms.size());

        //loop through and call relevant functions
        //Search memory object
        SearchMemory searchMemory = new SearchMemory();

        //store terms to get counts and timestamps + print including spacing
        System.out.println("");
        System.out.println("These are the search terms you entered, including their frequencies and timestamps:");
        System.out.println("");

        for(String term : terms) {
            searchMemory.storeSearch(term);

          }

          System.out.println("");
          System.out.println("These are the results of your searches when crawling the file");
          System.out.println("");

          //search for terms in file and print results
          for(String term : terms) {
            StringSearcher.searchFile("outputFile.csv",term);

          }


    }

}