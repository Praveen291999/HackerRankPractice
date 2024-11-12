package hackerRank.collection;

/*
Sample Input

3
uncle sam
99912222
tom
11122222
harry
12299933
uncle sam
uncle tom
harry
Sample Output

uncle sam=99912222
Not found
harry=12299933

*/
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class JavaMap {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int entries = s.nextInt();
		s.nextLine();
		Map<String, Integer> phoneMap = new HashMap<>();
		for (int i = 0; i < entries; i++) {
			String name = s.nextLine();
			int phoneNumber = s.nextInt();
			s.nextLine();
			phoneMap.put(name, phoneNumber);
		}
		while (s.hasNext()) {
			String query = s.nextLine();

			if (phoneMap.containsKey(query)) {
				System.out.println(query + "=" + phoneMap.get(query));
			} else {
				System.out.println("Not found");
			}
		}
	}
}
