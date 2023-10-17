package JAVA;

import java.math.BigInteger;

public class factorial {

	public static void main(String[] args) {
//		int num = 10;
//		long factorial =1;
//		for(int i=1;i<=num;++i) {
//		factorial = factorial*i;}
//		System.out.println("factorial of" +num+"is"+factorial);
//		
        //for big nos we can not use long so use bit integer
        int num = 40;
         BigInteger factorial = BigInteger.ONE;
         for(int i=1;i<=num;++i) {
         factorial = factorial.multiply(BigInteger.valueOf(i));}
        		System.out.println("factorial of" +num+"is"+factorial);
        
	

}
}