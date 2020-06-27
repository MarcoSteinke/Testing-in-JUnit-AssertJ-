package math.product;

public class Product {

    public static double of(double... parameters) {
        if(parameters.length > 0) {
            double result = parameters[0];
            for (int i = 1; i < parameters.length; i++) {
                result *= parameters[i];
            }

            return result;
        }

        return 0;
    }
}
