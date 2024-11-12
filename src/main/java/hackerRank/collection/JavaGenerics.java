package hackerRank.collection;

public class JavaGenerics {

	public static <T> void printArray(T[] array) {
		for (T elements : array) {
			System.out.println(elements);
		}
	}

	public static void main(String[] args) {
		Integer[] a =new Integer[] {1,2,3};
		String[] b=new String[] {"Hello","World"};
		printArray(a);
		printArray(b);

	}

}
