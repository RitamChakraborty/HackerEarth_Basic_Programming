// FIXME: 12/20/19 
// https://www.hackerearth.com/practice/basic-programming/implementation/basics-of-implementation/practice-problems/algorithm/complete-the-syllabus/

package www.hackerearth.com.practice.basic_programming.implementation.basics_of_implementation.practice_problems.complete_the_syllabus;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class TestClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int t = sc.nextInt();
		
		while (t-- > 0) {
			int n = sc.nextInt();
			int max = 0;
			
			for (int i = 0; i < 7; ++i) {
				int m = sc.nextInt();
				
				if (m == 1) {
					max = Integer.max(max, i);
				}
			}
			
			switch (max) {
				case 0:
					System.out.println("MONDAY");
					break;
				case 1:
					System.out.println("TUESDAY");
					break;
				case 2:
					System.out.println("WEDNESDAY");
					break;
				case 3:
					System.out.println("THURSDAY");
					break;
				case 4:
					System.out.println("FRIDAY");
					break;
				case 5:
					System.out.println("SATURDAY");
					break;
				case 6:
					System.out.println("SUNDAY");
					break;
			}
		}
	}
}
