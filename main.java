import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/**
 * This is checking the input and calculating all the words and the counts of it.
 *
 * @version 1.1
 * @see Map
 */

public class main {
    /**
     * HashMap is created for string and integer to store the words and values
     *
     * @see HashMap
     */



    public static HashMap<String, Integer> words = new HashMap<>();

    /** Applying a reader to read the text. Connect it with an array to get all the words
     * and not count anything that is not a word
     *
     * @param args stores all the values for the program
     * @throws IOException exception is thrown
     * @see HashMap
     */
    public static void main(String[] args) throws IOException {



        BufferedReader inputs = new BufferedReader(new FileReader("input.txt"));  // Adding a reader to read the text file
        //HashMap<String, Integer> words = new HashMap<>();
        ArrayList<String> order = new ArrayList<>();  // ordering all the words in an array
        String line = "";
        while((line = inputs.readLine())!= null){    // Added a string called line to read each line of inputs.
//            line = line.replaceAll("(\\.|,|;|:|\\?|\\!|—)", "");
            line = line.replaceAll("([^A-Za-z ]+)", "");  // to ignore everything that is not a word.
            line = line.replaceAll("( )+", " ");
            line = line.toLowerCase(Locale.ROOT);
            String[] lineWords = line.split(" ");
            /**
             * keeps adding the words when it comes more than once and apples it as a pair
             * to see the how many counts.
             *
             * @<code></code>
             * @see ArrayList
             */
            for(String word: lineWords){                  // adding a value to each word and to count it everytime it comes up
                if(words.containsKey(word)){
                    words.put(word, words.get(word) + 1);

                }
                else
                    words.put(word, 1); // if not, it will just be a value of one

            }
        }
        List<Map.Entry<String, Integer> >   // listing all the words in a list
                list = new LinkedList<>(words.entrySet());
        /**
         * Apples it into a list and shows each word from greatest to least
         *
         * @implNote
         * @see List
         */

        // Sort the list
        Collections.sort(list, (o1, o2) -> (o2.getValue()).compareTo(o1.getValue())); // sorting each word from greatest to least
        System.out.println(list);
        // use put and gets. put adds to hashmap and establishes initial value. get returns value for a specific key.


    }

    /**
     * returns all the words in the array
     *
     *  @return returns the words list in an array
     * @see Collections
     */
    public HashMap<String, Integer> listAmount(){
        return words;
    }

    /** Method to made to use in the test method.
     *
     *  @throws IOException throws exception
     */
    public void read() throws IOException {

        BufferedReader inputs = new BufferedReader(new FileReader("input.txt"));
        //HashMap<String, Integer> words = new HashMap<>();
        ArrayList<String> order = new ArrayList<>();
        String line = "";
        while((line = inputs.readLine())!= null){
//            line = line.replaceAll("(\\.|,|;|:|\\?|\\!|—)", "");
            line = line.replaceAll("([^A-Za-z ]+)", "");
            line = line.replaceAll("( )+", " ");
            line = line.toLowerCase(Locale.ROOT);
            String[] lineWords = line.split(" ");
            for(String word: lineWords){
                if(words.containsKey(word)){
                    words.put(word, words.get(word) + 1);

                }
                else
                    words.put(word, 1);

            }
        }

        List<Map.Entry<String, Integer> >
                list = new LinkedList<>(words.entrySet());


        // Sort the list
        Collections.sort(list, (o1, o2) -> (o2.getValue()).compareTo(o1.getValue()));
        System.out.println(list);
    }
}
