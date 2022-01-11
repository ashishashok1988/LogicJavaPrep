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

public class ArrangeWords {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String sentence = "The lines are printed in reverse order.";

        System.out.println(sentence);
        String result = Result4.arrange(sentence);

        System.out.println("Rearranged sentence: " + result);

        bufferedReader.close();
    }
}

class Result4 {

    public static String arrange(String sentence) {
    // Write your code here

        sentence = sentence.substring(0, sentence.length()-1);

        String[] words = sentence.split(" ");

        List<Word> wordList = new ArrayList<>();
        Integer wordsLength = words.length;

        for (int i = 0; i < wordsLength; i++) {
            Word word = new Word(words[i]);
            wordList.add(word);
        }
        Collections.sort(wordList);

        StringBuilder newSentence = new StringBuilder();

        newSentence.append(toCamelCase(wordList.get(0).wordString));

        for (int i = 1; i < wordList.size(); i++) {
            newSentence.append(" ");

            Word word = wordList.get(i);

            newSentence.append(word.wordString.toLowerCase());
        }
        newSentence.append(".");
        return newSentence.toString();
    }

    static String toCamelCase(String word) {
        String first = word.substring(0, 1).toUpperCase();
        return first + word.substring(1);
    }

}
class Word implements Comparable<Word> {
    String wordString;
    
    Word(String wordString) {
        this.wordString = wordString;
    }
    
    public int compareTo(Word otherWord) {
        Integer thisWordStringLength = wordString.length();
        Integer otherWordStringLength = otherWord.wordString.length();
        if (thisWordStringLength < otherWordStringLength) {
            return -1;
        } else if (thisWordStringLength > otherWordStringLength) {
            return 1;
        }

        return 0;
    }
}