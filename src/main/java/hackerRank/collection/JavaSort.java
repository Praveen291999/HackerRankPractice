package hackerRank.collection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/*
 * Sample Input

5
33 Rumpa 3.68
85 Ashis 3.85
56 Samiha 3.75
19 Samara 3.75
22 Fahim 3.76
Sample Output

Ashis
Fahim
Samara
Samiha
Rumpas
 * 
 */

class Student {

	int id;
	String name;
	double cgpa;

	public Student(int id, String name, double cgpa) {

		this.id = id;
		this.name = name;
		this.cgpa = cgpa;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getCgpa() {
		return cgpa;
	}

}

public class JavaSort {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		List<Student> studentList = new ArrayList<>();

		for (int i = 0; i < size; i++) {
			int id = s.nextInt();
			String name = s.next(); // Read the name
			double cgpa = s.nextDouble();
			studentList.add(new Student(id, name, cgpa));
		}

		 studentList.stream().sorted(Comparator.comparing(Student::getCgpa).reversed().thenComparing(Student::getName))
				.map(Student::getName).forEach(System.out::println);
		
		 
//		 studentList.stream().sorted(Comparator.comparing((Student a)->a.getCgpa()).reversed().thenComparing(a->a.getName()))
//			.map(a->a.getName()).forEach(a->System.out.println(a));
//		 
		


	}

}
