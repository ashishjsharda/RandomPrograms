package CompleteReference;
import java.util.function.Function;

/**
 * Using Functions Example 6
 * @author ashish
 */
public class FunctionEx6 {
    public static void main(String[] args) {
        Function<Integer,Integer> absthenNegate=((Function<Integer, Integer>)Math::negateExact).compose(Math::abs);
        System.out.println(absthenNegate.apply(-25));
        System.out.println(absthenNegate.apply(25));


          }
}
