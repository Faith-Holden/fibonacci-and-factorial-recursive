package solution;

import java.math.BigInteger;

public class Fibonacci {

    public static BigInteger getFibonacci(BigInteger desiredN){

        if(desiredN.equals(BigInteger.ZERO)){
            return BigInteger.ZERO;
        }else if(desiredN.equals(BigInteger.ONE)){
            return BigInteger.ONE;
        }else{
            BigInteger fibNum1 = getFibonacci(desiredN.subtract(BigInteger.ONE));
            BigInteger fibNum2 = getFibonacci(desiredN.subtract(BigInteger.TWO));
            return fibNum1.add(fibNum2);
        }
    }



}
