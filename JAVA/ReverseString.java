package javaprograms;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
    //Reverse a given String
	System.out.println("Reverse a given String");
	String S = "Good day";
	String[] words = S.split(" +");
	StringBuilder SB = new StringBuilder();
	for(int i=words.length-1;i>=0;i--) {
		//StringBuilder sb2 = new StringBuilder();
		SB.append(words[i]);
		SB.append(" ");
		}
    System.out.println(SB);
   
     System.out.println("================");
     System.out.println("================");
 	
    //reverse each word in a string
    System.out.println("reverse each word in a string");
    String str = "my name is raghav";
    String echwords[]=str.split("\\s");  
    String revword =" "; 
    for(String w:echwords){  
        StringBuilder sb=new StringBuilder(w);  
        sb.reverse();  
        revword =revword+sb.toString()+" ";  
    } 
    System.out.println("reverse words-------> "+revword);
    
    System.out.println("================");
    System.out.println("================");
    
    //Reverse  string and also each word in a string
    System.out.println("Reverse  string and also each word in a string");
    String string = "my name is raghav";
    String reverseword =" "; 
    int length = string.length();
    for(int i=length-1; i>=0;i--){  
         reverseword = reverseword+string.charAt(i);
      }
    System.out.println(reverseword);
}
}
