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


public class RodCutting {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter number of rods:");
        int lengthsCount = Integer.parseInt(bufferedReader.readLine().trim());

        System.out.println("Enter lenth of each rod:");
        List<Integer> lengths = IntStream.range(0, lengthsCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .map(String::trim)
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> result = Result3.rodOffcut(lengths);

        System.out.println("number of rods during each cutoff:");
        System.out.println(result);

        bufferedReader.close();
    }
}

class Result3 {

    public static List<Integer> rodOffcut(List<Integer> rodLengths) {
    // Write your code here
        List<Integer> offcutList = new ArrayList<Integer>();
        Integer offcutLength;

        System.out.println(rodLengths);

        Collections.sort(rodLengths);

        while (rodLengths.size()>0) {
            offcutList.add(rodLengths.size());
            offcutLength = rodLengths.get(0);

            rodLengths.removeAll(Collections.singletonList(offcutLength));

            for(int i=0; i< rodLengths.size(); i++) {
                Integer newOffcutLength = rodLengths.get(i) - offcutLength;
                rodLengths.set(i, newOffcutLength);
            }

            System.out.println("new rod lengths:" + rodLengths);
        }
        return offcutList;
    }

}