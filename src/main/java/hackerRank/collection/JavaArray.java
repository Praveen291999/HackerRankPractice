package hackerRank.collection;

import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;



public class JavaArray {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        bufferedReader.close();
        
      int[] arrayInt = new int[n];
      

        // Populate the array with values from the list
        for (int i = 0; i < n; i++) {
            arrayInt[i] = a.get(i);
        }

        // Print out each value of the array
        for (int i = 0; i < n; i++) {
            System.out.println(arrayInt[i]);
        }
    
    
    
    }
}
