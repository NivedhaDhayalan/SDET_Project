
package JAVA;

public class alphanumericspecialCHAR {

	public static void main(String[] args) {
	  String str = "Ab234gr?jg*tghj!!f#56";
//	  String str1 = str.replaceAll("[^0-9]","");
//	  System.out.println(str1);
	  
	  StringBuffer Numbers = new StringBuffer(),
	        Alphabets = new StringBuffer(),
            Specialchar = new StringBuffer();
	  
	  for(int i=0;i<str.length();i++) {
		  if(Character.isDigit(str.charAt(i))) {
			  Numbers.append(str.charAt(i));
		  }
		  else if(Character.isAlphabetic(str.charAt(i))) {
			  Alphabets.append(str.charAt(i));
		  }
		  else{
			  Specialchar.append(str.charAt(i));
		  } 
	  }
	  System.out.println("Numbers ---->"+Numbers);
	  System.out.println("Alphabets--->"+Alphabets);
	  System.out.println("SpecialCharacters---->"+Specialchar);
   }
}
