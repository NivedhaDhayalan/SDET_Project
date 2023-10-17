package JAVA;

public class fibonocciseries {

	public static void main(String[] args) {
    int n=15, firstno = 0 , secondno=1;
    for(int i=1;i<=n;++i) {
    	System.out.println(firstno +"  ");
    	int nextno = firstno + secondno;
    	firstno = secondno;
    	secondno = nextno;	
    }
 }
	
}
