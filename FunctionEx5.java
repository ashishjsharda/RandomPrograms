import java.util.function.Function;

/**
 * Using Functions Example 5
 * @author ashish
 */
public class FunctionEx5 {
    public static void main(String[] args) {
        Function<Integer,Double> even=a->a/2.0;
        System.out.println(even.apply(10));
    }
}
