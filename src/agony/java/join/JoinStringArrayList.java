package agony.java.join;

import agony.java.returns.StringReturn;
import agony.java.returns.bool.BooleanFalse;
import agony.java.returns.bool.BooleanReturn;
import agony.java.returns.bool.BooleanTrue;

import java.util.ArrayList;

public class JoinStringArrayList {
    public static void join(ArrayList<String> arr) throws StringReturn {
        join(arr, 0);
    }

    public static void join(ArrayList<String> arr, int n) throws StringReturn {
        try {
            BooleanReturn.make(n >= arr.size());
        } catch (BooleanFalse e) {
            try {
                join(arr, n + 1);
            } catch (StringReturn stringReturn) {
                throw new StringReturn(arr.get(n) + stringReturn.value);
            }
        } catch (BooleanTrue e) {
            throw new StringReturn("");
        }
    }
}
