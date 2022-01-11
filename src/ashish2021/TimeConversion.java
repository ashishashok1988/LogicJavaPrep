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

class Result {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
    // Write your code here
        String[] timesplit = s.split(":");
        Integer hr = Integer.valueOf(timesplit[0]);

        String newTime = ""; 
        if (s.substring(s.length()-2).equalsIgnoreCase("am")) {
            if (hr == 12) {
                newTime = "00" + ":" +timesplit[1] + ":" + timesplit[2];
            } else {
                newTime = s;
            }
            newTime = newTime.replace("am", "");
            newTime = newTime.replace("AM", "");
        } else if(s.substring(s.length()-2).equalsIgnoreCase("pm")) {
            if (hr == 12) {
                newTime = s;
            } else {
                newTime = String.valueOf(hr+12) + ":" + timesplit[1] + ":" + timesplit[2];
            }
            newTime = newTime.replace("pm", "");
            newTime = newTime.replace("PM", "");
        }

        return newTime;

    }

}

public class TimeConversion {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter time in 12hr format");
        String s = bufferedReader.readLine();

        String result = Result.timeConversion(s);

        System.out.println(result);
        bufferedReader.close();
    }

}
