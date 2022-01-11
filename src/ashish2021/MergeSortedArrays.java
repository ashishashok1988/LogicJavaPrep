package ashish2021;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MergeSortedArrays {

    public static void main(String[] args) {
        int[] array1 = { 2,  5, 6, 8, 10, 15 };
        int[] array2 = { 1,  7, 13, 17, 20 };
        

        MergeSortedArrays mergeSortedArrays = new MergeSortedArrays();

        System.out.println(mergeSortedArrays.performMerge(array1, array2));

    }

    public List<Integer> performMerge(int[] array1, int[] array2) {

        List<Integer> arrayList1 = new ArrayList<Integer>();
        List<Integer> arrayList2 = new ArrayList<Integer>();

        for (int i = 0; i < array1.length; i++) {
            arrayList1.add(array1[i]);
        }

        for (int i = 0; i < array2.length; i++) {
            arrayList1.add(array2[i]);
        }

        arrayList1.addAll(arrayList2);

        Collections.sort(arrayList1);

        return arrayList1;
    }

}
