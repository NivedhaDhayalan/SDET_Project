package javaprograms;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class mostrepeatedword {

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		String string = "aaa abc aaa bbb aaa ccc bca";
		for(String word : string.split(" ")) {
		if(map.get(word)==null) {
			map.put(word, 1);}
			else{
				map.put(word, map.get(word)+1);
			}
		}
String str = Collections.max(map.entrySet(),Map.Entry.comparingByValue()).getKey();
   System.out.println(map.get(str)+"\n"+" repeated word is  "
   		+ " "+str);
	}

}
