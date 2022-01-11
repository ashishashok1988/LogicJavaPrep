package ashish2021;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindIndicies {

    public static List<Integer> findIndicies(int[] input, int target) {
        int originalTarget = target;
        List<Integer> indiciesList = new ArrayList<Integer>();

        int fromIndex = 0;

        for (int i = 0; i < input.length; i++) {
            if (input[i] > target) {
                continue;
            } else {
                indiciesList.add(i);
                fromIndex = i;
                target -= input[i];
                if (target == 0)
                    return indiciesList;
            }
        }
        if (target != 0 && fromIndex < input.length) {
            return findIndicies(Arrays.copyOfRange(input, fromIndex + 1, input.length), originalTarget);
        }
        return indiciesList;
    }

    public static void main(String args[]) {
        int[] input = { 7, 5,4, 3, 2};
        int target = 17;
        System.out.println(findIndicies(input, target));
    }

}
