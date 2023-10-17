package javaprograms;

public class Stringprogram {

	public static void main(String[] args) {
	String string = "all is well";
 String[] words =  string.split(" +");
	StringBuilder sb = new StringBuilder();
	
	for(int i=words.length-1; i>=0;i--) {
		sb.append(words[i]);
		sb.append(" ");
		System.out.println(sb);
	}
}
}	


