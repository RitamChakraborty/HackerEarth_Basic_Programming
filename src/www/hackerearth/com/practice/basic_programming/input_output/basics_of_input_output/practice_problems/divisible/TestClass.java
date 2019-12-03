// https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/divisibe-or-2d8e196a/

package www.hackerearth.com.practice.basic_programming.input_output.basics_of_input_output.practice_problems.divisible;

import java.util.*;

public class TestClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long sum = 0;
		
		for (int i = 0; i < n; ++i) {
			int m = sc.nextInt();
			int digit;
			
			if (i < n / 2) {
				int len = Integer.toString(m).length();
				digit = m / (int) Math.pow(10, len - 1);
			} else {
				digit = m % 10;
			}
			
			if (i % 2 == 0) {
				sum += digit;
			} else {
				sum -= digit;
			}
		}
		
		System.out.println(sum % 11 == 0 ? "OUI" : "NON");
	}
}
