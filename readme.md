1. Project's Title
Adding Memory to our Search

2. Project Description
I did not include the Merger and Deduper class from last week. I simply added the output file that was merged and deduped into the directory to perform the search and memory storage

One driver class holds the main method that runs the core logic.

Additionally, I have the StringSearcher class from last week, a new TimeConverter class to get timestamps in a human-readable format, and the SearchMemory class that stores the search terms, search frequencies, and timestamps, and prints them. 


The application flow is as follows:
-the main method from the driver class prompts the user to enter search terms and enter 'exit' when the user is finished
-these terms are stored in an ArrayList to call 2 methods as seen below
-the SearchMemory class is called to store these terms and their frequencies in a HashMap, and the times in an ArrayList. Within the storeSearch method of the SearchMemory class, we call the getTime method of the TimeConverter class to get the timestamp in the right format
-the StringSearcher class is then used to perform the same function as last week, and search for the search term in the csv file and print the row number and row contents

A video was also provided to demonstrate the running of this application 

3. How to Install and Run the Project
The code can be run as is without the need to install additional packages. 
