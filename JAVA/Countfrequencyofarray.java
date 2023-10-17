package JAVA;

import java.util.HashMap;
import java.util.Map;

public class Countfrequencyofarray {
	public static void main(String[] args) {
		int[] arr = {1,5,2,5,5,1,2,7};
		int length = arr.length;
frequencycount(arr,length);
	}

	
	public static void frequencycount(int[] arr, int length) {
		Map<Integer,Integer> Map = new HashMap<>();
		for(int i=0;i<length;i++) {
			if(Map.containsKey(arr[i])) {
				Map.put(arr[i], Map.get(arr[i])+1);
			}
			else {
				Map.put(arr[i], 1);
			}
		}
	
		
		  for (Map.Entry<Integer,Integer> entry : Map.entrySet()) {
		    
		        System.out.println(entry.getKey() + " " + entry.getValue());
}

	}}