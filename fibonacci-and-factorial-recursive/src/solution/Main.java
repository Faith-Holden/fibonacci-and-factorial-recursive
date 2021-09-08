package solution;

import java.math.BigInteger;

public class Main {
    public static void main(String[]args){
        System.out.println(Factorial.getFactorialResult(new BigInteger("10")));
        BigInteger testInt =  new BigInteger("15");
        System.out.println((Fibonacci.getFibonacci(testInt)).toString());
    }
}
