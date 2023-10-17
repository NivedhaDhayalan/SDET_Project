package javaprograms;

public class Add2nogettargetnumber {
     //Given an array of integers, find two numbers such that they add up to a specific target number
	
	public static void main(String[] args) throws Exception
	    {
	        int arr[] = { 1, 4,0,5, 2 } ;  
	        int target = 6;
	         int[] result =  printnos(arr ,target);
            System.out.println(result[0]+"       "+result[1]);  
	    }
	 
	          public static  int[] printnos(int arr[],int target) throws IllegalAccessException{
		        for(int i=0; i<arr.length-1;i++) {
		        	 for(int j=i+1; j<arr.length; j++) {
		        		 if(arr[i]+arr[j]==target) {
		        	     return new int[]  {i,j};
		        	     }
		        	 }
		        }
				 throw new IllegalArgumentException("invalid elements");
    }  
}


