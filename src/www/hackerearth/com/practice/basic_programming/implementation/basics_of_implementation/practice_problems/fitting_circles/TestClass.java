// https://www.hackerearth.com/practice/basic-programming/implementation/basics-of-implementation/practice-problems/algorithm/fitting-circles-c00a5be3/

package www.hackerearth.com.practice.basic_programming.implementation.basics_of_implementation.practice_problems.fitting_circles;

import java.util.*;
import java.io.*;

class TestClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int t = sc.nextInt();
		
		while (t-- > 0) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			int big = Integer.max(a, b);
			int small = Integer.min(a, b);
			
			System.out.println(big / small);
		}
	}
}
