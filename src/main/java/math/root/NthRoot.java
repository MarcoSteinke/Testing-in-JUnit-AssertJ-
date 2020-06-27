package math.root;

public class NthRoot {

    public static double of(double n, double base) {
        if(n == 0 && base != 0) {
            return Double.MAX_VALUE;
        } else if(n == 0 && base == 0) {
            return 1.0;
        }
        return Math.pow(base, 1/n);
    }
}
