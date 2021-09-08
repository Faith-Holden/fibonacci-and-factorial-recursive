package solution;

import java.math.BigInteger;

public class Factorial {
    public static BigInteger getFactorialResult(BigInteger inputValue){
        if(inputValue.equals(BigInteger.ZERO)){
            return BigInteger.ONE;
        }
        else{
            BigInteger newInputValue = inputValue.subtract(BigInteger.ONE);
            return inputValue.multiply(getFactorialResult(newInputValue));
        }
    }
}
