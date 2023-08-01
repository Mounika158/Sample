package example;

import java.util.HashSet;
import java.util.Iterator;

public class Task1 {

	public static void main(String[] args) {
		//taking an empty hashset
		HashSet<String> h_set = new HashSet<>();
		//adding the elements with add method
		h_set.add("Black");
		h_set.add("Blue");
		h_set.add("White");
		h_set.add("orange");
		h_set.add("pink");
		//duplicate elements
		h_set.add("orange");
		
		System.out.println(h_set);
		//iterate elements - read the elements
		//set iterate
		Iterator<String> read = h_set.iterator();
		//iterate hashset
		while(read.hasNext()) {
			System.out.println(read.next());

	}

}
}
