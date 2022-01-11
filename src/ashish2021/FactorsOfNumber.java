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


public class FactorsOfNumber {

    public static void main(String[] args) throws IOException {

        long n = 233;

        long p = 28;

        long result = Result6.pthFactor(n, p);

        System.out.println(result);
    }
}

class Result6 {

    /*
     * Complete the 'pthFactor' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts following parameters:
     *  1. LONG_INTEGER n
     *  2. LONG_INTEGER p
     */

    public static long pthFactor(long number, long pthNumber) {

        List<Long> factorsList = new ArrayList<Long>();

        for (long i = 1; i <= number; ++i) {
            if (number % i == 0) {
                factorsList.add(i);
            }
        }

        if (factorsList.size() >= pthNumber) {
            return factorsList.get((int) (pthNumber-1));
        }

        return 0;
    }

}