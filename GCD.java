
/**
 * Find GCD
 * @author ashish
 */
public class GCD {

    /**
     * Given 2 numbers ,get GCD
     * @param num1
     * @param num2
     * @return int
     */
    public static int getGCD(int num1,int num2)
    {
        if(num1==num2)
        {
            return num1;
        }
        else if(num1>num2)
        {
            return getGCD(num1-num2,num2);
        }
        return getGCD(num2,num1);
    }

    public static void main(String[] args) {

        System.out.println(getGCD(10,100));
    }
}
