package agony.java.reverse;

import agony.java.returns.StringArrayListReturn;
import agony.java.returns.VoidReturn;
import agony.java.returns.bool.BooleanFalse;
import agony.java.returns.bool.BooleanReturn;
import agony.java.returns.bool.BooleanTrue;

import java.util.ArrayList;

public class ReverseStringArrayList {
    public static void reverse(ArrayList<String> arr) {
        try {
            BooleanReturn.make(arr.size() > 0);
        } catch (BooleanTrue e) {
            String first = arr.remove(0);
            reverse(arr);
            arr.add(first);
        } catch (BooleanFalse ignored) {}
    }
}
