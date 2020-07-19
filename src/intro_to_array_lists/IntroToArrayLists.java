package intro_to_array_lists;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList class
		ArrayList<String> words = new ArrayList<String>();
		
		//2. Add five Strings to your list
		words.add("Apple");
		words.add("Garage");
		words.add("Chair");
		words.add("Book");
		words.add("Table");
		//3. Print all the Strings using a standard for-loop
		for(int i = 0;i<words.size();i++) {
			String s = words.get(i);
			System.out.println(s);
		}
		
		//4. Print all the Strings using a for-each loop
		for(String s:words) {
			System.out.println(s);
		}
		
		for(int i = 0;i<words.size();i++) {
			if(i%2==0) {
				String s = words.get(i);
				System.out.println(s);
			}
		}
		//5. Print only the even numbered elements in the list.
		
		//6. Print all the Strings in reverse order.
		for(int i = words.size() - 1;i>=0;i--) {
			String s = words.get(i);
			System.out.println(s);
		}
		//7. Print only the Strings that have the letter 'e' in them.
		for(int i = 0;i<words.size();i++) {
			String s = words.get(i);
			for(int x = 0;x<s.length();x++) {
				String ch = "";
				char c = s.charAt(x);
				ch += c;
				String let = "e";
				if(ch.equalsIgnoreCase(let)) {
					System.out.println(s);
				}
			}
		}
	}
}
