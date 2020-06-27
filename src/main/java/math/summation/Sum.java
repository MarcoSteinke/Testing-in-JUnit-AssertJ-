package math.summation;

public class Sum {

    public static double of(double... parameters) {
        double result = 0;
        for(double parameter : parameters) {
            result += parameter;
        }

        return result;
    }
}
