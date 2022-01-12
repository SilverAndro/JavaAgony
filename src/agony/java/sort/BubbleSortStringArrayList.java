package agony.java.sort;

import agony.java.returns.VoidReturn;
import agony.java.returns.bool.BooleanFalse;
import agony.java.returns.bool.BooleanReturn;
import agony.java.returns.bool.BooleanTrue;

import java.util.ArrayList;

public class BubbleSortStringArrayList {
    public static void sort(ArrayList<String> arr) {
        sort(arr, arr.size());
    }

    public static void sort(ArrayList<String> arr, int n) {
        doPass(arr, n, 0);

        try {
            BooleanReturn.make(n - 1 > 1);
        } catch (BooleanTrue e) {
            sort(arr, n - 1);
        } catch (BooleanFalse ignored) {}
    }

    public static void doPass(ArrayList<String> arr, int n, int i) {
        try {
            try {
                BooleanReturn.make(i < n - 1);
            } catch (BooleanFalse e) {
                throw new VoidReturn();
            } catch (BooleanTrue e) {
                try {
                    shouldSwap(arr.get(i), arr.get(i + 1));
                } catch (BooleanTrue e2) {
                    String temp = arr.get(i);
                    arr.set(i, arr.get(i + 1));
                    arr.set(i + 1, temp);
                } catch (BooleanFalse ignored) {}
                doPass(arr, n, i + 1);
            }
        } catch (VoidReturn ignored) {}
    }

    public static void shouldSwap(String a, String b) throws BooleanTrue, BooleanFalse {
        BooleanReturn.make(a.charAt(0) > b.charAt(0));
    }
}
