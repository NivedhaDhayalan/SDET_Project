package javaprograms;

public class move0toend {
public static void main(String[] args) {
	int arr[] = {1,0,2,0,5,7};
	int n = arr.length;
    pushZerosToEnd(arr, n);
    System.out.println("Array after pushing zeros to the back: ");
    for (int i=0; i<n; i++)
        System.out.print(arr[i]+" ");
     }
	
    static void pushZerosToEnd(int arr[], int n) {		
		int count = 0;
	for (int i = 0; i < arr.length; i++)
	{
	   if (arr[i] != 0)
	   {
	      arr[count++] = arr[i];
	   } }
	    while (count < arr.length)
	      arr[count++] = 0;
       
}
}