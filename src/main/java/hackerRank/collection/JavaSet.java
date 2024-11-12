package hackerRank.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/*
 * 
 * 5
john tom
john mary
john tom
mary anna
mary anna
Sample Output

1
2
2
3
3
 * 
 */
public class JavaSet {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		s.nextLine();
		Set<String> hashString = new HashSet<>();
		List<Integer> setSize = new ArrayList<>();
		for (int i = 0; i < size; i++) {
			String name = s.nextLine();
			hashString.add(name);
			setSize.add(hashString.size());
		}
		setSize.forEach(System.out::println);
	}

}
