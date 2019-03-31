package intro_to_array_lists;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList class
		ArrayList<String> list = new ArrayList<String>();
		//2. Add five Strings to your list
		list.add("hioadhf");
		list.add("hie");
		list.add("hidsgdsaeasf");
		list.add("hiaqwrEfsd");
		list.add("hisdkfh");		
		//3. Print all the Strings using a standard for-loop
		for(int i = 0; i < list.size(); i++) {
			//System.out.println(list.get(i));
		}
		//4. Print all the Strings using a for-each loop

		//5. Print only the even numbered elements in the list.
		for(int k = 0; k < list.size(); k++) {
			if(k%2==0) {
				//System.out.println(list.get(k));
			}
		}
		//6. Print all the Strings in reverse order.
		for(int a = list.size() - 1; a > 0; a--) {
			//System.out.println(list.get(a));
		}
		//7. Print only the Strings that have the letter 'e' in them.
		for(int e = 0; e < list.size(); e++) {
			String temp = list.get(e);
			for(int s = 0; s < temp.length(); s++) {
				if(temp.substring(s, s).equals("e")){
					System.out.println(temp);
				}
			}
		}
	}
}
