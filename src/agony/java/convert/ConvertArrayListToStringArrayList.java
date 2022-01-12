package agony.java.convert;

import agony.java.returns.StringArrayListReturn;

import java.util.ArrayList;

public class ConvertArrayListToStringArrayList {
    public static void convertArr(Integer[] arr) throws StringArrayListReturn {
        convertArr(arr, 0);
    }

    public static void convertArr(Integer[] arr, int startIndex) throws StringArrayListReturn {
        ArrayList<String> out = new ArrayList<>();

        try {
            out.add(arr[startIndex].toString());
        } catch (ArrayIndexOutOfBoundsException oob) {
            throw new StringArrayListReturn(new ArrayList<>());
        }

        try {
            convertArr(arr, startIndex + 1);
        } catch (StringArrayListReturn ret) {
            out.addAll(ret.value);
        }

        throw new StringArrayListReturn(out);
    }
}
