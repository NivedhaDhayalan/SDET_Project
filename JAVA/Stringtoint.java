package JAVA;

import java.util.Arrays;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Stringtoint {

	public static void main(String[] args) {
		//string to int
		String string = "200";
		Integer integer = Integer.valueOf(string);
          System.out.println(integer);
          
          //int to string
         int integer1 = 399;
         String str = Integer.toString(integer1);
         System.out.println(str);
         
         
         
         //string arr to string
        // String[] s = {"r","a","g","h","a","v"};
         String x = Arrays.asList("r","a","g","h","a","v").stream().collect(Collectors.joining(""));	
         System.out.println(x);
         
         
         //interger array to int
         String y = Arrays.asList(1,2,3,4,5,6,7).stream().map(e->String.valueOf(e)).collect(Collectors.joining(""));
        	System.out.println(y);	
	}

}
