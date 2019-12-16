// https://www.hackerearth.com/practice/basic-programming/implementation/basics-of-implementation/practice-problems/algorithm/array-sum-2-725368ac/

package www.hackerearth.com.practice.basic_programming.implementation.basics_of_implementation.practice_problems.array_sum;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;

public class TestClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int n = sc.nextInt();
		BigInteger bi = BigInteger.ZERO;
		for (int i = 0; i < n; ++i) {
			String num = sc.next();
			bi = bi.add(new BigInteger(num));
		}
		
		System.out.println(bi.toString());
	}
}
