package JAVA;

public class Armstrongno {

	public static void main(String[] args) {
		int number = 153, orgNumber,  reminder , result=0;
		orgNumber = number;
		while(orgNumber!=0) {
			reminder = orgNumber%10;
			result += Math.pow(reminder,3);
			orgNumber/=10;
		}
		if(result==number) {
		System.out.println(number + "is a armstrongno");
		}
		else {
			System.out.println(number + "is not a armstrongno");	
		}
	}
}
