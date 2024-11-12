package hackerRank.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

/*
 * Sample Input

{}()
({()})
{}(
[]
Sample Output
true
true
false
true
 * 
 */

public class JavaStack {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		while (s.hasNext()) {
			String braces = s.nextLine();
			System.out.println(validParanthesis(braces));
		}

	}

	private static boolean validParanthesis(String braces) {
		Map<Character, Character> mapString = new HashMap<>();
		mapString.put('(', ')');
		mapString.put('{', '}');
		mapString.put('[', ']');

		// {}
		Stack<Character> st = new Stack<>();
		for (char ch : braces.toCharArray()) {

			if (mapString.containsKey(ch)) {
				st.push(ch);
			} else {
				// If it is a closing bracket check for it's matching openeing bracket
				// pop() method removes and returns the poped element
				if (st.empty() || mapString.get(st.pop()) != ch) {
					return false;
				}
			}

		}
		// If there are matching paranthesis then all would have been poped and stack
		// will be empty
		return st.isEmpty();

	}

}
