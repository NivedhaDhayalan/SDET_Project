package JAVA;

import java.util.Scanner;

public class swap2no {
public static void main(String[] args) {
//		int a=23;
//		int b=29;
//		 System.out.println("Before swapping:"+a+b);
//		 a=a+b;
//		 b=a-b;
//		 a=a-b;
//		 System.out.println("After swapping:"+"a="+a+"b="+b);
	
	try (Scanner input = new Scanner(System.in)) {
		System.out.println("Before Swapping");
		int a = input.nextInt();
		int b = input.nextInt();
		int temp;
		temp = a ;
		a=b;
		b=temp;
		System.out.println("After Swapping"+"a="+a+"b="+b);
	}
  }
}
