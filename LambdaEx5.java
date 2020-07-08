import java.util.Arrays;
import java.util.List;

/**
 * Using Lambda Exprssion Example 2
 * @author ashish
 */
public class LambdaEx5 {


    public static void main(String[] args) {

        Integer []arr={10,20,30,40};
        List<Integer> list= Arrays.asList(arr);
        list.forEach(x-> System.out.println(x));
    }
}
