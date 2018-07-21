package TDD1;

public class MathHelper {

    private MathHelper() {
    }

    public static Double sum(Double first, Double second) {
        return first + second;
    }

    public static Double diff(Double first, Double second) {
        return first - second;
    }

    public static Double mult(Double first, Double second) {
        return first * second;
    }

    public static Double div(Double first, Double second) throws Exception {
        if(second == 0) {
            throw new Exception("Divided by zero");
        }

        return first / second;
    }

    public static Double maxAbs(Double first, Double second) {
        return (Math.abs(first) > Math.abs(second)) ? first : second;
    }
}
