// https://www.hackerearth.com/practice/basic-programming/implementation/basics-of-implementation/practice-problems/algorithm/find-the-pattern-6/

package www.hackerearth.com.practice.basic_programming.implementation.basics_of_implementation.practice_problems.find_the_pattern;

import java.io.*;
import java.util.*;

public class TestClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int n = sc.nextInt();
		
		long max = Long.MIN_VALUE;
		long min = Long.MAX_VALUE;
		
		for (int i = 0; i < n; ++i) {
			long m = sc.nextLong();
			max = Long.max(max, m);
			min = Long.min(min, m);
		}
		
		System.out.println(max + min);
	}
}
