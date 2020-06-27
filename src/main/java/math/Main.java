package math;

import math.factorial.Factorial;
import math.product.Product;
import math.root.NthRoot;
import math.summation.Sum;


public class Main {

    public static void main(String[] args) {

        // sum of 1, 2, 3
        double result = Sum.of(1, 2, 3);
        // 3rd root of 8
        double root = NthRoot.of(3, 8);
        // comment
        // product of 1, 2, 3
        result = Product.of(1, 2, 3);

        result = Factorial.of(5);
    }
}
