package ashish2021;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class RansomNote {
    public static void main(String[] args) throws IOException {

        String text = "The quick brown fox jumps over the lazy dog";

        String note = "visa";

        boolean result = ResultV2.canConstructLetter(text, note);

        System.out.println(result);
    }
}

class ResultV2 {

    /*
     * Complete the 'canConstructLetter' function below.
     *
     * The function is expected to return a BOOLEAN.
     * The function accepts following parameters:
     *  1. STRING text
     *  2. STRING note
     */

    public static boolean canConstructLetter(String text, String note) {
        Map<Character, Integer> charMapOccurrences = new HashMap<>();

        // Create a map of characters with number of occurrences from 'text'
        for (char c : text.toCharArray()) {
            charMapOccurrences.put(c, charMapOccurrences.getOrDefault(c, 0) + 1);
        }

        // For each character in the 'note', if found in 'charMapOccurrences',
        // subtract the number of occurrences from the 'charMapOccurrences'.
        // If character in the 'note' is not found or if the number of new 
        // occurrences in 'charMapOccurrences' is 0, return false. else return true.
        for (char c : note.toCharArray()) {
            if (!charMapOccurrences.containsKey(c) || charMapOccurrences.get(c) == 0) {
                return false;
            } else {
                charMapOccurrences.put(c, charMapOccurrences.get(c) - 1);
            }
        }
        return true;
    }


}
