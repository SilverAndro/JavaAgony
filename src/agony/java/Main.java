package agony.java;

import agony.java.convert.ConvertArrayListToStringArrayList;
import agony.java.join.JoinStringArrayList;
import agony.java.returns.StringArrayListReturn;
import agony.java.returns.StringReturn;
import agony.java.reverse.ReverseStringArrayList;
import agony.java.sort.BubbleSortStringArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        run(new Integer[]{35, 9, 1});
        run(new Integer[]{35, 1, 9, 2, 2, 999, 0, 0});
        run(new Integer[]{0, 1, 9, 1, 5});
    }

    public static void run(Integer[] arr) {
        System.out.println("Input: " + Arrays.toString(arr));

        try {
            ConvertArrayListToStringArrayList.convertArr(arr);
        } catch (StringArrayListReturn e) {
            ArrayList<String> list = e.value;
            BubbleSortStringArrayList.sort(list);
            System.out.println("Sorted: " + list);
            ReverseStringArrayList.reverse(list);
            System.out.println("Reversed: " + list);
            try {
                JoinStringArrayList.join(list);
            } catch (StringReturn e2) {
                System.out.println("Output: " + e2.value);
            }
        }
    }
}
