package hackerRank.swiggy;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Merge2Array {
	
	public static List<Integer> mergeArrays(List<Integer> a ,List<Integer> b){
		return Stream.concat(a.stream(), b.stream()).toList();
		
	}
	
	public static void main(String[] args) {
		int[] a=new int[] {1,5,3,7,8};
		int[] b=new int[] {8,1,2,6,9};
		
		List<Integer> lista=Arrays.stream(a).boxed().toList();
		List<Integer> listb=Arrays.stream(b).boxed().toList();
		
		System.out.println(mergeArrays(lista,listb));
	}

}
