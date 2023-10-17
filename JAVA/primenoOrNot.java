package JAVA;

public class primenoOrNot {

	public static void main(String[] args) {
	int number  = 48;
	Boolean flag=false;
for(int i=2;i<=number/2;++i) {
		if(number%i==0) {
			flag =true;
			break;
		}
	}
	if(!flag) {
		System.out.println(number+"   "+"is a prime no");
	}
	
	else{
		System.out.println(number+"   "+"isnot  a prime no");

	}
	
	
	
	
	
	
	}
}
