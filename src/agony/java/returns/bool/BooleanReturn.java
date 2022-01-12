package agony.java.returns.bool;

public class BooleanReturn {
    public static void make(Boolean cond) throws BooleanTrue, BooleanFalse {
        int compared = cond.compareTo(false);

        try {
            int dummy = 1 / compared;
        } catch (ArithmeticException err) {
            throw new BooleanFalse();
        }

        throw new BooleanTrue();
    }
}
