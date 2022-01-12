package agony.java.returns;

public class StringReturn extends Throwable {
    public String value;
    public StringReturn(String returnValue) {
        value = returnValue;
    }
}
