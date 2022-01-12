package agony.java.returns;

import java.util.ArrayList;

public class StringArrayListReturn extends Throwable {
    public ArrayList<String> value;
    public StringArrayListReturn(ArrayList<String> returnArr) {
        this.value = returnArr;
    }
}
