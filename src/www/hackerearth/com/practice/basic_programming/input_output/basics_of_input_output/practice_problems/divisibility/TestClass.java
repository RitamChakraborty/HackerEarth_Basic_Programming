// https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/divisible-or-not-81b86ad7/

package www.hackerearth.com.practice.basic_programming.input_output.basics_of_input_output.practice_problems.divisibility;

import java.util.*;

public class TestClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		while (n -- > 0) {
			int m = sc.nextInt();
			
			if (n == 0) {
				System.out.println(m % 10 == 0 ? "Yes" : "No");
			}
		}
	}
}