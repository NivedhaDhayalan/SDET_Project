package JAVA;

import java.util.ArrayList;
import java.util.Iterator;

public class arraylistIteration {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(6);
		list.add(9);
		list.add(5);
		list.add(1);
		list.add(16);
		for(int printlist : list) {
			System.out.println(printlist);
		}
		for (int i=0;i<=0;i++) {
			System.out.println(list);
		}
		Iterator<Integer> it = list.iterator();
while( it.hasNext() ) {
			System.out.println("values are"+it.next());
	}
   }
}
