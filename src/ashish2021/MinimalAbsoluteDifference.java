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


public class MinimalAbsoluteDifference {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int numbersCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> numbers = IntStream.range(0, numbersCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .map(String::trim)
            .map(Integer::parseInt)
            .collect(toList());

        ResultV1.closestNumbers(numbers);

        bufferedReader.close();
    }
}


class ResultV1 {

    /*
     * Complete the 'closestNumbers' function below.
     *
     * The function accepts INTEGER_ARRAY numbers as parameter.
     */

    public static void closestNumbers(List<Integer> numbers) {

        Integer minimalAbsoluteDifference = Integer.MAX_VALUE;
        Collections.sort(numbers);

        for (int i=0; i<numbers.size()-1; i++) {
            for (int j=i+1; j<numbers.size(); j++) {
                if (Math.abs(numbers.get(i) - numbers.get(j)) < minimalAbsoluteDifference) {
                    minimalAbsoluteDifference = Math.abs(numbers.get(i) - numbers.get(j));
                }
            }
        }

        for (int i=0; i<numbers.size()-1; i++) {
            for (int j=i+1; j<numbers.size(); j++) {
                if (Math.abs(numbers.get(i) - numbers.get(j)) == minimalAbsoluteDifference) {
                    System.out.print(numbers.get(i) + " " + numbers.get(j) + "\n");
                }
            }
        }

    }

}
