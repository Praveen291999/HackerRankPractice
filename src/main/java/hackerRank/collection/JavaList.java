package hackerRank.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Sample Input

5
12 0 1 78 12
2
Insert
5 23
Delete
0

Sample Output

0 1 78 12 23
*/

public class JavaList {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		List<Integer> integersList = new ArrayList<>();
		int listSize = s.nextInt();

		for (int i = 0; i < listSize; i++) {
			integersList.add(s.nextInt());
		}
		int index = s.nextInt();

		for (int i = 0; i < index; i++) {

			String query = s.next();

			if (query.equals("Insert")) {
				List<Integer> indexInsert = new ArrayList<>();
				for (int j = 0; j < 2; j++) {
					indexInsert.add(s.nextInt());
				}
				integersList.add(indexInsert.get(0), indexInsert.get(1));
			}

			if (query.equals("Delete")) {
				int d = s.nextInt();
				integersList.remove(d);
			}

		}
		
		integersList.forEach(n->System.out.print(n +" " ));
	}

}
